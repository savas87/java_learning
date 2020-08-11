
public class fahrenheitCelsiusConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(convertCelsiusToFahrenheit(41));
	}
	// converter TF = (9 / 5) * TC + 32.
	public static double convertCelsiusToFahrenheit( int celsius) {
		double fahrenheit = (9.0/5.0) * celsius + 32;
		return fahrenheit;
	}

}
