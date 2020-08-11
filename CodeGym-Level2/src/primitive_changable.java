
public class primitive_changable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student savas = new Student();
		savas.name = "Savas";
		savas.age = 32;
		
		System.out.println(savas.name + " is "+savas.age+ " years old");
		// new student change the data from other student
		Student a = savas;
		a.age = 63;
		System.out.println(savas.name + " is "+savas.age+ " years old");
	}
	
	static class Student{
		String name;
		int age;
	}

}
