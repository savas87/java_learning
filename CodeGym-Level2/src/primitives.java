
public class primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// erzeuge einen Student
		Student savas  = new Student();
		savas.name = "Savas";
		savas.age = 32;
		
		System.out.println("Savas ist "+savas.age);
		// this function doesn't change the age
		ageSwap(savas);
		System.out.println("Savas ist "+savas.age);
	}
	//swap methode
	public static void ageSwap(Student a) {
		int c = a.age;
		a.age = 32;
	}
	// klasse Student
	static class Student {
		String name;
		int age;
	}
}
