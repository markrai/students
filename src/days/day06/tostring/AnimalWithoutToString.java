package days.day06.tostring;

public class AnimalWithoutToString {

	private String name;
	private String type;

	AnimalWithoutToString(String name, String type) {
		this.setName(name);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
