package core.day3.fibonacci;

public class SyedFibonacci {

	public void calculateFebunacci() {
		int a = 0, b = 1, c;
		System.out.println(a);
		System.out.println(b);
		c = a + b;
		System.out.println(c);
		while (c < 13) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		SyedFibonacci fb = new SyedFibonacci();
		fb.calculateFebunacci();
	}

}
