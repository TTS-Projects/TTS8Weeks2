package arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
         System.out.print(toPower(4,2));
	}

	/*
	 * 
	 */
	public static ArrayList<Integer> toPower(Integer size, Integer power) {
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(0);
		arraylist.add(1);
		return(arraylist);
	}
}
