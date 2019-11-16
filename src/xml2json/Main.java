package xml2json;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import departments.entity.Employee;

public class Main {

	public static void main(String[] args) {

		File xmlFile = new File("/temp/input.xml");

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Employee.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Employee employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);

			System.out.println(employee);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
