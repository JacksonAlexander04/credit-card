import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class CreditCard {

	public static void main(String[] args) throws IOException {
		readTextFile();
	}
		public static void readTextFile() throws IOException {
			Long [] cardNumber = new long[99];
		Scanner myFile = new Scanner(new File("card.txt"));
		int counter = 0;
		while(myFile.hasNext()) {
			String word = myFile.next();
			System.out.println(word);
			
		}

	}
	

}
