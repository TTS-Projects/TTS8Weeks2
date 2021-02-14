package challenge1;

import java.util.Scanner;

public class Main {  

 static int methodCount;

 static String className;
public static void main(String[] args)   { 

	System.out.println("Please enter 5 numbers");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number- ");  
	int a= sc.nextInt();  
	System.out.print("Enter second number- ");  
	int b= sc.nextInt();  
	System.out.print("Enter third number- ");  
	int c= sc.nextInt();
	System.out.print("Enter fourth number- ");  
	int d= sc.nextInt();  
	System.out.print("Enter fifth number- ");  
	int e= sc.nextInt();  
	int array[] = new int[] {a,b,c,d,e};
	Numbers numbersObj = new Numbers(array);
	
	
	numbersObj.printSum();
	numbersObj.printProduct();
	numbersObj.printLargest();
	numbersObj.printSmallest();
	

	
	
}
	

	}
