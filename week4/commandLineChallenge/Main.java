import java.util.Scanner;

public class Main {  

 static int methodCount;

 static String className;
public static void main(String[] args)   { 

    

	System.out.println("STTTTTTTAARTTTING PROGRAM!!!!!!! \n" );

	System.out.println("Printing Numbers \n");
	AsciiChars.printNumbers();
	System.out.println("Printing LowerCase! \n");
	AsciiChars.printLowerCase();
	System.out.println("Printing UpperCase!  \n");

	AsciiChars.printUpperCase();
	
	
	
	startUI();

	}



public static void startUI() {
	
	System.out.println("STARTING UI");
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Please enter your name: \n");
	String someString = scanner.next();
	
	System.out.println("Hello " + someString);
	
	System.out.print("Do you wish to continue the interactive portion:(yes/no, y/n) ");
	
	String playAgain = scanner.next();
	
	if(playAgain.equals( "y" ) || playAgain.equals( "yes" ) ) {
		playGame();
	}
	else {
		exitGracefully();
	}

	
	


	
	
}
public static void playGame() {
	int flag = 0;
	
	//Checks flag to check if loop should keep running
	while(flag == 0) {
		// make object for the numbers
		RandomGenerator newNumbers = new RandomGenerator();
		
		Scanner gameScanner = new Scanner(System.in);
		
		//red car
		boolean errorCheck = false;
		while (errorCheck == false) {
			//red car
			System.out.print("Do you have a red car? (yes, no):  ");
			String redCar = gameScanner.next();
			errorCheck = newNumbers.checkCar(redCar);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, wrong message. Please try again");
			}
			
		}
		
		
		//favorite pet
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("What is your favorite pet?: ");
			String petString = gameScanner.next();  // no change
			errorCheck = newNumbers.checkPet(petString);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, No numbers in answer or at least 3 letter pets are needed. Please try again");
			}		
		}
		
		//lucky number 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("	What is your lucky number (0-9):	");
			String favoriteNumber = gameScanner.next(); /// ################ convert to number
			errorCheck = newNumbers.checkLuckyNumber(favoriteNumber);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, wrong message. Please try again");
			}	
		}
		
		//favorite quarterback
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("	Do you have a favorite quarterback, if so, what is their jersey number (0-99)? 	");
			String jerseyNumber = gameScanner.next(); //// ############### convert to number
			errorCheck = newNumbers.checkJerseyNumber(jerseyNumber);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, invalid input. Please choose a number between 0 and 9, inclusively");
			}	
		}		
		
		//two digit model 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("	What is two-digit model year of their car? (0-99): ");
			String twoDigitCarModelYear = gameScanner.next(); 
			errorCheck = newNumbers.checkTwoDigit(twoDigitCarModelYear);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, invalid input. Please choose a number between 0 and 99, inclusively");
				}	
		}	
		//first name - actor 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("What is the first name of the their favorite actor or actress? ");
			String firstNameFavoriteActor = gameScanner.next();// no change
			errorCheck = newNumbers.checkActorName(firstNameFavoriteActor);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, wrong message. Please try again");
				}	
		}			
		
		//random number (1-50) 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("Enter a random number between 1 and 50.");
			String numberBetweenOneAndFifty = gameScanner.next();
			errorCheck = newNumbers.checkNumberInRange(numberBetweenOneAndFifty);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, invalid input. Please choose a number between 1 and 50, inclusively");
				}	
		}
		newNumbers.generateNumbers();
		newNumbers.printLotteryNumbers();

		String playAgain = gameScanner.next();
		
		if(playAgain.equals( "y" ) || playAgain.equals( "yes" ) ) {
			playGame();
		}
		else {
			exitGracefully();
		}
		
		
	}
}

public static void exitGracefully() {
	System.out.println("Thank you for playing! Exiting now...");
}


}

