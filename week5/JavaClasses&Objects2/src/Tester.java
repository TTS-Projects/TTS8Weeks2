
public class Tester {

	public static void main(String[] args) {
		// Testing Calculator
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 4));
		System.out.println(cal.subtract(5, 4));
		System.out.println(cal.multiply(5, 4));
		System.out.println(cal.divide(5, 4));
		System.out.println(cal.square(9, 4));
		
		//Testing MagicCal
		MagicCalculator magicCal = new MagicCalculator();
		System.out.println(magicCal.square(5));
		System.out.println(magicCal.cosine(5));
		System.out.println(magicCal.sine(5));
		System.out.println(magicCal.tangent(5));
		System.out.println(magicCal.factorial(5));

	}

}
