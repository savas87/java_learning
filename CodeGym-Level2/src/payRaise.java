
public class payRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print.
•	The hackSalary method should not return a result.
•	The main method should call the hackSalary method only once.
•	The hackSalary method should increase the input parameter by 1000 and output text to the screen according to the specified template.
EASY
*/
	hackSalary(2000);
	}
	
	public static void hackSalary (int a) {
		int increase = 1000;
		System.out.print("Your salary is: "+(a+increase)+" dollars per month");
	}

}
