package days.day08.AnonymousClass;

class A {

	public void show() {
		System.out.println("Inside the A class's show()");
	}

}

class B {

	public void show() {

		System.out.println("Inside the B class's show()");
	}
}

public class Usecase {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
	}
}


// when we want to use the method of A, but we don't want A's implementation