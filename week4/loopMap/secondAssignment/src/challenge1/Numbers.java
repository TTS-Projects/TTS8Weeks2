package challenge1;

public class Numbers {
	public int publicArray[];
	
	public Numbers(int[] array) {
		publicArray = new int[5];
		System.arraycopy(array, 0, publicArray, 0, 5);
		
	}
	public void printSum() {
		int sum = 0;
		for (int i = 0; i<publicArray.length; i++) {
			sum = sum + publicArray[i];
		}
		System.out.println("Sum is: " + sum);
	}
	public void printProduct() {
		int sum = 1;
		for (int i = 0; i<publicArray.length; i++) {
			sum = sum * publicArray[i];
		}
		System.out.println("Product is: " + sum);
	}
	public void printLargest() {
		int max = publicArray[0];
		for (int i = 0; i<publicArray.length; i++) {
			if(publicArray[i] > max) {
				max = publicArray[i];
			}
		}
		System.out.println("largest is: " + max);
	}
	public void printSmallest() {
		int min = publicArray[0];
		for (int i = 0; i<publicArray.length; i++) {
			if(publicArray[i] < min) {
				min = publicArray[i];
			}
		}
		System.out.println("Smallest is: " + min);
	}

}
