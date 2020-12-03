package bruteforce;

import java.util.Arrays;
import java.util.Scanner;


public class bruteforce {

	// Scanner initialisiert
	private static final Scanner scanBot = new Scanner(System.in);

	// System.out.println()
	public static void sout(String txt) {
		System.out.println(txt);
	}
	public static void soutUI() {
		System.out.println("*************************************");
	}

	// Main Ausfuehrung
	public static void main(String[] args) {
		boolean loop = true;
		String key = new String(); // Variable hat NULL
		String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String joinedString = Arrays.toString(numbers);
		soutUI();
//		sout(joinedString);
		
		do {
			sout("type in your *4-digit PIN*: ");
			String enter = scanBot.nextLine();
			soutUI();
			if (enter.length() == 4) {
				loop = false;
				sout("perfect! you entered a 4-digit-PIN.");
				key = enter;
			}
		} while (loop);

//		sout("" + key);

		String[] keySplit = key.split("");
		String[] solution = new String[4];

//		sout(keySplit[0]);
//		sout(numbers[0]);
		long startTime = System.nanoTime();
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].equals(keySplit[0])) {
				solution[0] = numbers[i];
			}
		}
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j].equals(keySplit[1])) {
				solution[1] = numbers[j];
			}
		}
		for (int k = 0; k < numbers.length; k++) {
			if (numbers[k].equals(keySplit[2])) {
				solution[2] = numbers[k];
			}
		}
		for (int l = 0; l < numbers.length; l++) {
			if (numbers[l].equals(keySplit[3])) {
				solution[3] = numbers[l];
			}
		}
		
		long endTime = System.nanoTime();
		
		soutUI();
		sout("password cracked: " 
					+ solution[0] + " . " 
					+ solution[1] + " . " 
					+ solution[2] + " . " 
					+ solution[3]);
		sout("time: " + (endTime - startTime) + "ns");
		soutUI();
	}
}