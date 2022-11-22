package default_2;
import java.util.*;
import java.util.LinkedList;


//import package_3.DataTypesHelper2;
//import java.util.

class DataTypes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("it is working.");
//		DataTypesHelper obj = new DataTypesHelper();
//		System.out.print(obj.id);
//		
//		
//		//attempt to use package_3, will work if class is 'public'
//		DataTypesHelper2 obj2 = new DataTypesHelper2();
//		//obj2.id;
		
		//going into linkedlists
		//DataTypes2 workingObj = new DataTypes2(); //creating object to call non-static methods
		//workingObj.linkedListFunctions();
		//linkedListFunctions(); //static
		
		stacks();
		
	}
	// learn about linkedlists and its usage.
	public static  void linkedListFunctions() {
		LinkedList<String> animalList = new LinkedList<String>();
		animalList.add("frog");
		System.out.println(animalList);
		animalList.add("giraffe");
		animalList.add("buffalo");
		animalList.add("mongoose");
		System.out.println(animalList);
		// => [frog, giraffe, buffalo, mongoose]

		// Puts shark as the first element in the ArrayList
		animalList.addFirst("shark"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose]

		// Puts koala as the last element in the ArrayList
		animalList.addLast("koala"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose, koala]
		    
		// This adds the value cuttlefish to the 3rd index of the LinkedList
		animalList.add(3, "cuttlefish"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]
		
		
	}
	public static  void queue() {
		//Queue<String> q = new LinkedList<String>();
		
		
//		for(int i = 5; i < 10; i++) {
//			myQueue.add(i);
//		}
		

		// Display contents of the queue. 
		//System.out.println("Elements of queue-"+ myQueue);

	}
	public static void stacks() {
		// Imports the data we need to use the Stack class

		Stack<Integer> myStack; 
		// creates a reference variable for a Stack called myStack
		myStack = new Stack<Integer>(); 
		// creates a new Integer Stack and assigns its address to myStack

		myStack.push(1); 
		// Pushes 1 to the top of our stack
		// myStack now consists of [1]
		myStack.push(2);
		// myStack now consists of [1, 2] 
		myStack.push(3);
		// myStack now consists of [1, 2, 3] 

		// Despite pushing to the "top" of the stack, the printed representation 
		// puts our new numbers at the back. The important part is that they are 
		// removed from the same place they are added.



	}
//	//takes inputs a and b (int) and returns the value
//	//of a + b
//	public static Integer add(Integer a, Integer b) {
//		
//		
//		return(a+b);
//	}

}
