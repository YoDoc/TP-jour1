package tp1;

import java.util.Scanner;

public class TestDeParseInt {

	public static void main(String[] args) {

		int x = Integer.parseInt("9");
		double c = Double.parseDouble("5");
		// This returns an integer, given a string representation of decimal,
		// binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16 respectively)
		// numbers as input.
		int b = Integer.parseInt("444", 16);

		System.out.println("initial " + x);
		System.out.println("initial " + c);
		System.out.println("initial " + b);

		// essai
		Scanner userInput = new Scanner(System.in);

		System.out.println("Donne moi une valeur numérique");
		
		boolean saisieUserBonne = true;
		while (saisieUserBonne) {
			try {
				int entier = userInput.nextInt();
				int valeurAbsolueDeEntier = fonctionValeurAbsolue(entier);
//				Integer.parseInt(entier);
				saisieUserBonne = true;
				System.out.println("valeur absolue est ..." + valeurAbsolueDeEntier);

			} catch (Exception e) {
				saisieUserBonne = false;
				System.out.println("Donnes moi un Entier!!");
			}
		}
	}

	public static int fonctionValeurAbsolue(int a) {
		int abs = Math.abs(a);

		return abs;

	}
}
