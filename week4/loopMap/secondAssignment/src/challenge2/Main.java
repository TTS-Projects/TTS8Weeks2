package challenge2;
import java.util.HashMap; // import the HashMap class
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> vehicles = new HashMap<String, String>();
		vehicles.put("Civic","Honda");
		
		System.out.print("What are you looking for?");

		Scanner modelInquirer = new Scanner(System.in);
		String model = modelInquirer.next();
		
		if(vehicles.containsKey(model)) {
			System.out.println("Oh, you're looking for a " + model + "? Our " + vehicles.get(model) + " selection is right over here...");
		}
		else {
			System.out.print("Sorry, we just got started and we don't have the model");
		}
		

	}

}
