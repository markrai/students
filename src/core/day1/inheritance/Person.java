package core.day1.inheritance;

public class Person {
	
	private int age;
	private float height;
	private boolean isMarried;

	public void walk() {
		System.out.println("Person's walk method");
	}

	public void talk() {
		System.out.println("Person's talk method");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
	

}
