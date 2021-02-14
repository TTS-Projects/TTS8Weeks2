import java.util.Random;
public class RandomGenerator {
	
	
    public String redCar;
    public String petString;
    public String favoriteNumber;
    public String jerseyNumber;
    public String twoDigitCarModelYear;
    public String firstNameFavoriteActor;
    public String numberBetweenOneAndFifty;
    //constructor
    public RandomGenerator() {
        redCar = "empty";
        petString = "empty";
        favoriteNumber = "empty";
        jerseyNumber = "empty";
        twoDigitCarModelYear = "empty";
        firstNameFavoriteActor = "empty";
        numberBetweenOneAndFifty = "empty";
        
        
    }
    // For now it just passes in the input ########### NEEDS CHECKING
    //checking red car input
    public boolean checkCar(String potentialCar) {
    	if (potentialCar.equals("yes") || potentialCar.equals("no") ) {
    		return true;
    	}
    	return false;
    }
    //checking petString input
    public boolean checkPet(String potentialPet) {
    	return true;
    }    
    //checking lucky Number input
    public boolean checkLuckyNumber(String potentialNumber) {
    	return true;
    }    
    //checking jersey number input
    public boolean checkJerseyNumber(String jerseyNumber) {
    	return true;
    }    
    //checking two digit input
    public boolean checkTwoDigit(String potentialTwoDigit) {
    	return true;
    }    
    //checking name of actor input
    public boolean checkActorName(String potentialActor) {
    	return true;
    }    
    //checking number input between 1 and 50
    public boolean checkNumberInRange(String potentialNumber) {
    	return true;
    }
    
    public void generateNumbers() {
    	
    	
    	/*
    	 * Now that you have 6 or 7 pieces of information it's time to generate the lottery numbers. The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75.

    To accomplish this you should have 3 random integers, generated in the same way as in the previous exercises. You may also want to declare constants for the max values of each set of of numbers.


*/

//1.  make the ceiling constant of 65 and 75
    	int magicBallCeilingConstant = 75;
		int fiveRandomValuesCeilingConstant = 65; 

/*

	first number -> between 1 and 2
	second number -> between 1 and ?
	third number -> between 1 and ?
	
*/
		Random rand = new Random(); //instance of random class
      	int upperbound = magicBallCeilingConstant;
	


/*
    Generate the "magic ball" first. It should be the user's favorite quarterback jersey number or their lucky number, ------> 1. First number
    multiplied by one of the random numbers. Make sure that the answer is less the max "magic" number of 75; 
    if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.

    For the 5 non-magic numbers use your choice of any of the following methods to generate values: (Note that you may have to adjust each value to correct range by adding/subtracting.)

    Find the 3rd letter of their favorite pet. Convert that character value to an integer value. ----> 2. convert 3rd letter to ascii
    
    Use the two digit model year of their car and add their lucky number to it.  ----->   3. Third number
    
    Use the random number between 1 and 50, subtracting one of the generated random numbers.
    
    
    Convert the first letter of their favorite actor/actress to an integer and use that value.   ------> 4. First letter of actor/actress and convert to ascii
    Convert the last letter of their favorate actor/actress to an integer and use that value.  -----> 5. Convert the last letter to ascii value

	Use the value 42. ------> 6. Use the value 45
   
    
    Once all the numbers have been calculated, print them out in this form: ` Lottery numbers: 4, 17, 15, 52, 26 Magic ball: 22
    	 */
    	
    }

}
