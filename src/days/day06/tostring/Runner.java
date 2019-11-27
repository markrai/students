package days.day06.tostring;

public class Runner {

	public static void main(String[] args) {
		
		AnimalWithoutToString a = new AnimalWithoutToString("Bobo", "Dog");
		AnimalWithoutToString b = new AnimalWithoutToString("Dolly", "Dolphin");
		AnimalWithoutToString c = new AnimalWithoutToString("Coco", "Chimpanzee");
		
		
		AnimalWithToString d = new AnimalWithToString("Bobo", "Dog");
		AnimalWithToString e = new AnimalWithToString("Dolly", "Dolphin");
		AnimalWithToString f = new AnimalWithToString("Coco", "Chimpanzee");
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		
	}
}
