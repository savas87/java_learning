
public class converterEuroToUsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(converter(12, 1.13));
	}
	public static double converter (int euro, double exchangeRate) {
		double result  = euro * exchangeRate;
		return result;
	}
}
