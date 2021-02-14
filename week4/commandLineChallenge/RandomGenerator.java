import java.util.Random;
public class RandomGenerator {
	
	
    public boolean redCar;
    public String petString;
    public int favoriteNumber;
    public int jerseyNumber;
    public int twoDigitCarModelYear;
    public String firstNameFavoriteActor;
    public int numberBetweenOneAndFifty;
    public int lotteryNumbers[];
    public int magicBallNumber;
    public int firstRandom;
    public int secondRandom;
    public int thirdRandom;
    
    
    
    //constructor
    public RandomGenerator() {
    	lotteryNumbers = new int[5];
		Random rand = new Random(); //instance of random class
		firstRandom = rand.nextInt(2); // for the multiplication of jersey
		secondRandom = rand.nextInt(49) + 1; // This is for the number in between 1 and 50.
		thirdRandom = rand.nextInt(9) + 1; // This is kind of a backup in case the second Number fails

        petString = "";
        favoriteNumber = -1;
        jerseyNumber = -1;
        twoDigitCarModelYear = -1;
        firstNameFavoriteActor = "";
        numberBetweenOneAndFifty = -1;
        
        
    }
    public boolean isNumeric(String str) { 
    	  try {  
    	    Double.parseDouble(str);  
    	    return true;
    	  } catch(NumberFormatException e){  
    	    return false;  
    	  }  
    	}
    // For now it just passes in the input ########### NEEDS CHECKING
    //checking red car input
    public boolean checkCar(String potentialCar) {
    	if (potentialCar.equals("yes") ) {
    		this.redCar = true;
    		return true;
    	}
    	else if(potentialCar.contentEquals("no")) {
    		this.redCar = false;
    		return true;

    	}
    	return false;
    }
    //checking petString input
    public boolean checkPet(String potentialPet) {
    	if(potentialPet.length() < 3) return false;
    	if(potentialPet.matches(".*\\d.*")) return false;
    	petString = potentialPet;
    	return true;
    }    
    //checking lucky Number input
    public boolean checkLuckyNumber(String potentialNumber) {
    	if(this.isNumeric(potentialNumber)) {
    		int potentialInt = Integer.parseInt(potentialNumber);
    		if(potentialInt > 9 || potentialInt < 0) {
    			return false;
    		}
    		favoriteNumber = potentialInt;
    	}
    	else {
    		return false;
    	}
    	return true;
    }    
    //checking jersey number input
    public boolean checkJerseyNumber(String jNumber) {
    	if(this.isNumeric(jNumber)) {
    		int potentialInt = Integer.parseInt(jNumber);
    		if(potentialInt > 99 || potentialInt < 0) {
    			return false;
    		}
    		jerseyNumber = potentialInt;
    	}
    	else {
    		return false;
    	}
    	return true;
    }    
    //checking two digit input
    public boolean checkTwoDigit(String potentialTwoDigit) {
    	if(this.isNumeric(potentialTwoDigit)) {
    		int potentialInt = Integer.parseInt(potentialTwoDigit);
    		if(potentialInt > 99 || potentialInt < 0) {
    			return false;
    		}
    		twoDigitCarModelYear = potentialInt;
    	}
    	else {
    		return false;
    	}
    	return true;
    }    
    //checking name of actor input
    public boolean checkActorName(String potentialActor) {
    	if(potentialActor.matches(".*\\d.*")) return false;
    	firstNameFavoriteActor = potentialActor;
    	return true;
    }    
    //checking number input between 1 and 50
    public boolean checkNumberInRange(String potentialNumber) {
    	if(this.isNumeric(potentialNumber)) {
    		int potentialInt = Integer.parseInt(potentialNumber);
    		if(potentialInt > 50 || potentialInt < 0) {
    			return false;
    		}
    		numberBetweenOneAndFifty = potentialInt;
    	}
    	else {
    		return false;
    	}
    	return true;
    }
    
    public void generateNumbers() {
    	
    	
      	/*
	    Generate the "magic ball" first. It should be the user's favorite quarterback jersey number or their lucky number, ------> 1. First number
	    multiplied by one of the random numbers. Make sure that the answer is less the max "magic" number of 75; 
	    if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.
	 	*/
      	//Making the magic ball number
      	magicBallNumber = jerseyNumber * firstRandom;
      	
      	//Takes away crazy ints multiplied by max of 2 (random int)
      	while(magicBallNumber > 150) {
      		magicBallNumber = jerseyNumber -75; //essentially, it can't be multiplied so do nothing
      	}
      	
      	//Condenses the value between 1 and 75
      	if(magicBallNumber > 75) {
      		magicBallNumber = (magicBallNumber*firstRandom) - 75;
      	}
      	
      	
      	
      	/*
	    For the 5 non-magic numbers use your choice of any of the following methods to generate values: (Note that you may have to adjust each value to correct range by adding/subtracting.)
	
	    Find the 3rd letter of their favorite pet. Convert that character value to an integer value. ----> 2. convert 3rd letter to ascii
	   
	    */
      	//make first lottery number
      	char thirdLetterOfPet = petString.charAt(2);
      	lotteryNumbers[0] = (int) thirdLetterOfPet;
      	lotteryNumbers[0] = lotteryNumbers[0] - 64; // to make sure it stays in ascii range
      	
      	
      	/*
	    Use the two digit model year of their car and add their lucky number to it.  ----->   3. Third number
	    */
    	
      	//making the second number 
      	lotteryNumbers[1] = twoDigitCarModelYear;
      	while(lotteryNumbers[1] > 65) {
      		lotteryNumbers[1] = lotteryNumbers[1] - secondRandom;
      	}
      	
      	
      	
     
      	
      	/*
	    Use the random number between 1 and 50, subtracting one of the generated random numbers.
	    */
      	//making the third Number
      	lotteryNumbers[2] = numberBetweenOneAndFifty;
      	if(lotteryNumbers[2]-thirdRandom > 0) {
      		lotteryNumbers[2] -= thirdRandom;
      	}
    
	    /*
	    Convert the first letter of their favorite actor/actress to an integer and use that value.   ------> 4. First letter of actor/actress and convert to ascii
	
	     */
      	//fourth Number
      	char firstLetterOfActor = firstNameFavoriteActor.charAt(0);
      	lotteryNumbers[3] = (int) firstLetterOfActor;
      	lotteryNumbers[3] = lotteryNumbers[3] - 64; // to make sure it stays in range
	      	
	    /*
		Use the value 42. ------> 6. Use the value 45 (haha jk)
		
		*/
      	//fifth Number :)
      	lotteryNumbers[4] = 42;
      	
      	/*
   
    
    Once all the numbers have been calculated, print them out in this form: ` Lottery numbers: 4, 17, 15, 52, 26 Magic ball: 22
    	 */
    	
    }
    public void printLotteryNumbers() {
    	System.out.println("Lottery numbers: " + lotteryNumbers[0] + ", " + lotteryNumbers[1] + ", " 
    			+ lotteryNumbers[2] + ", " + lotteryNumbers[3] + ", " + lotteryNumbers[4] + 
    			" Magic ball:" + magicBallNumber);
    	
    }

}
