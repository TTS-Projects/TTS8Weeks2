
public class DataStructures2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Testing sumAllValues
		int[] array = new int[5];
		array[0] = 5;
		array[1] = 6;
		array[2] = 7;
		array[3] = 8;
		array[4] = 9;
		int test = sumAllValues(array);
		System.out.println(test);
		
		//Testing output #2
		outputTest();
		
		//Testing toPower
		int size = 5;
		int power = 2;
		int testArray[] = toPower(size, power);
	}
	
	public static int sumAllValues(int[] array) {
		
		int sum = 0;
		for (int i = 0; i < array.length; i ++) {
			sum = sum + array[i];
		}
		
		
		return sum;
		
	}
	
	public static void outputTest() {
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);
	}
	public static int[] toPower(int size, int power) {
		int array[] = new int[size+1];
		
		
		for (int index = 0; index < size; index++) {
			int total = (int) Math.pow(index, power);
			System.out.print(total);
			array[index] = total;
			
		}
		
		return (array);
	}
	

}
