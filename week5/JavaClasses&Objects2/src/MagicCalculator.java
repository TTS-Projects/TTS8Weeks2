
public class MagicCalculator {
	public double square(int num1) {
		return (Math.sqrt(num1));
	}
	public double sine(int num1) {
		return  (Math.sin(num1));
	}
	public double cosine(int num1) {
		return (Math.cos(num1));
	}
	public double tangent(int num1) {
		return (Math.tan(num1));
	}
	public int factorial(int num1) {
		int total = 1;
		for (int i = num1; i > 0 ;i--  ) {
			total = total *num1;
		}
		return (total);
	}
}
