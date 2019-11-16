package xml2json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class Xml2Json {

	static JSONObject mainJson = new JSONObject();

	public static void main(String[] args) throws IOException {
		try {
			// filename is filepath string
			String filePath = "/temp/input.xml";
			BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
			String line;
			StringBuilder sb = new StringBuilder();

			while ((line = br.readLine()) != null) {
				sb.append(line.trim());
			}

			JSONObject xmlJSONObj = XML.toJSONObject(sb.toString());
			JSONObject pilot = xmlJSONObj.getJSONObject("incident");
			JSONObject pilot1 = pilot.getJSONObject("ti");
			JSONArray s = pilot1.getJSONArray("ev");
			if (s.length() > 0) {
				for (int i = 0; i < s.length(); i++) {

					JSONObject mainObject = s.getJSONObject(i);
					JSONObject pilot3 = mainObject.getJSONObject("loc");

					// Initilize json for output

					JSONObject innerJson = new JSONObject();

					if (pilot3.has("geo")) {
						JSONObject valid = mainObject.getJSONObject("valid");
						JSONObject text = mainObject.getJSONObject("text");

						mainJson.put("_id", mainObject.getInt("id"));
						mainJson.put("description", text.getString("content"));

						JSONObject geo = pilot3.getJSONObject("geo");
						List<Double> cordinates = new ArrayList<>();
						cordinates.add(Double.valueOf(geo.getDouble("lon")));
						cordinates.add(Double.valueOf(geo.getDouble("lat")));

						innerJson.put("type", "point");
						innerJson.put("coordinates", cordinates);

						mainJson.put("geo", innerJson);
						mainJson.put("roadName", pilot3.getString("addr"));
						mainJson.put("eventCode", mainObject.getInt("ec"));
						mainJson.put("severity", mainObject.getInt("se"));
						mainJson.put("validStart", valid.getString("start"));
						mainJson.put("validEnd", valid.getString("end"));
						mainJson.put("type", "TrafficIncident");
						mainJson.put("lastUpdated", new Date());

						System.out.println(mainJson);

					}
					if (pilot3.has("start")) {
						JSONObject valid = mainObject.getJSONObject("valid");
						JSONObject text = mainObject.getJSONObject("text");

						mainJson.put("_id", mainObject.getInt("id"));
						mainJson.put("description", text.getString("content"));

						JSONObject start = pilot3.getJSONObject("start");

						JSONObject tmcJson = new JSONObject();
						tmcJson.put("table", start.getInt("extent"));
						tmcJson.put("id", start.getInt("id"));
						tmcJson.put("direction", "+");

						mainJson.put("tmc", tmcJson);

						mainJson.put("eventCode", mainObject.getInt("ec"));
						mainJson.put("severity", mainObject.getInt("se"));
						mainJson.put("validStart", valid.getString("start"));
						mainJson.put("validEnd", valid.getString("end"));
						mainJson.put("type", "TrafficIncident");
						mainJson.put("lastUpdated", new Date());

						System.out.println(mainJson);
					}
				}
			}

			// write output file
			String outputFileName = "/temp/output.json";

			// create object of file writer to write file
			FileWriter writer = new FileWriter(outputFileName);

			// store json object in to file
			writer.write(mainJson.toString());
		} catch (JSONException je) {
			System.out.println(je.toString());
		}
	}

}
