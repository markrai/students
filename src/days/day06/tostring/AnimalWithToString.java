package days.day06.tostring;

public class AnimalWithToString {

	private String name;
	private String type;

	AnimalWithToString(String name, String type) {
		this.setName(name);
		this.setType(type);
	}

	public static void main(String[] args) {
		AnimalWithToString a = new AnimalWithToString("Woofie", "Dog");
		System.out.println(a);

	}

	public String toString() {

		return "name is " + name + " and" + " type is " + type;

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
