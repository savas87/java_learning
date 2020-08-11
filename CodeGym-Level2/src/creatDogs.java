
public class creatDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create 3 Dog objects.
Store each instance in a separate variable.
Give them the names "Max", "Bella", and "Jack".
		 * */
		
		Dog max = new Dog();
		Dog bella = new Dog();
		Dog jack = new Dog();
		
		max.name = "Max";
		bella.name = "Bella";
		jack.name = "Jack";
			
	}
	public static class Dog{
		String name;
	}

}
