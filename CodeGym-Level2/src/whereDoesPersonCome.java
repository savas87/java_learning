
public class whereDoesPersonCome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * •	In the Person class, declare a String variable called name.
			•	In the Person class, declare an int variable called age.
			•	In the Person class, declare an int variable called weight.
			•	In the Person class, declare an int variable called money.
			•	In the main method, create a Person object and immediately assign a reference to it to the variable person.
			•	Five variables must be declared.
		 * */
		Person person = new Person();
		System.out.print(person.name + "\n");
		System.out.print(person.age + "\n");
		System.out.print(person.weight + "\n");
		System.out.print(person.money + "\n");

	}
	
	// create a Person class
	public static class Person {
		String name =  "Savas";
		int age = 32;
		int weight = 88;
		int money = 30000;
		
	}

}
