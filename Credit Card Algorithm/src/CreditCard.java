import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class CreditCard {
	static int counter = 0;
	static int[] individualNumbers = new int[16];
	static Long[] creditCardNumbers = new Long[99];

	public static void main(String[] args) throws IOException {
		readTextFile();
		checkValid();
	}

	public static void readTextFile() throws IOException {

		Scanner myFile = new Scanner(new File("cardNumbers"));

		while (myFile.hasNext()) {

			Long Card = myFile.nextLong();
			System.out.println(Card);
			for (int i = 0; i < 99; i++) {
				individualNumbers[i] = myFile.nextInt();
			}

		}

	}

	public static void checkValid() throws IOException {
		

	}

}
