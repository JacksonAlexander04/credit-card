import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class CreditCard {
	//create array and variables
	static long cardNumber;
	static int counter = 0;
	static long sum;
	static Long[] numbers = new Long[16];
	
	static boolean validCard = true;

	public static void main(String[] args) throws IOException {
		//get file
		Scanner myFile = new Scanner(new File("newCreditCards"));
		
		while (myFile.hasNext()) {	
				cardNumber = myFile.nextLong();
				
				checkValid();
		}
		//something
		//print out
		System.out.println("You have " + counter + " valid credit cards.");
	}

	
		

	

	public static void checkValid() {
		sum = 0;
		long printNumber = cardNumber;
		//get single digit
		for(int a = 15; a >= 0; a --) {
			
			numbers[a] = cardNumber % 10;
			cardNumber /= 10;

		}
		//mulitiply every other
		for(int b = 0; b < 16; b = b+2) {
			numbers[b]= numbers[b] * 2;
			
			if(numbers[b] >= 10) {
				long firstDigit = numbers[b] % 10;
				long secondDigit = numbers[b] / 10;
				numbers[b] = firstDigit + secondDigit;
			}
		}
			for(int c = 0; c < numbers.length; c++) {
				sum+=numbers[c];
			}
			if(sum % 10 == 0) {
				counter++;
				System.out.println(printNumber + "is valid");
			}
			else {
				System.out.println(printNumber + "is unvalid");
			}
			
			
		

	}

}
