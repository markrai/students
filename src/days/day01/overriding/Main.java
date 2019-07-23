package days.day01.overriding;

public class Main {
	
	public static void main(String[] args) {
		Animal a = new Animal();
		
		a.eat();
		a.walk();
		
		
		Bear b = new Bear();
		b.eat();
		b.walk();	
		
		
		Fish f = new Fish();
		f.eat();
		f.eat(5);
		
	}

}
