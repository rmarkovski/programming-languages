
public class RandomNumber {

	public static void main(String[] args) {
		
		double randomNum = (double) (Math.random()*100);
		int integerFromNumber = (int) randomNum;
		double decimalFromNumber = randomNum - integerFromNumber;
		char character = (char) integerFromNumber;
		
		System.out.println("From 0 to 100, the computer picked " + randomNum);
		System.out.println("Integer part of this number is " + integerFromNumber);
		System.out.println("Decimal part of this number is " + decimalFromNumber);
		System.out.println("Character code for " + integerFromNumber + " is " + character);
	}

}
