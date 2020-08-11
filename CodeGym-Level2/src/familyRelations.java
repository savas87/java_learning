
public class familyRelations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In the main method, create a Man object and save a reference to it in the variable man.
		 * In the main method, create a Woman object and save a reference to it in the variable woman.
		 * In the main method, store a reference to the previously created Woman object in man.wife.
		 * In the main method, store a reference to the previously created Man object in woman.husband.
		 * The Man class must have 3 variables.
		 * The Woman class must have 3 variables.
		 * */
		Man man = new Man();// create a Man Object and save a reference to it in variable
		Woman woman = new Woman(); // create a Man Object and save a reference to it in variable
		man.wife = woman; // store reference to the previously created woman object in
		woman.husband = man;
		
		System.out.println(man.wife);

	}
	
	public static class Man {
		public int age;
		public int height;
		public Woman wife;
	}
	public static class Woman {
		public int age;
		public int height;
		public Man husband;
	}

}
