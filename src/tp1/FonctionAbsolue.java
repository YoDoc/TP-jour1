/**
 * Fonction absolue qui prend une valeur en paramètre et retourne sa val absolue
 * 
 * Demander une valeur Stocker la valeur Appeler une fonction Créer cette
 * fonction Calculer sa val absolue La retourner Imprimer la valeur
 * 
 *
 */

package tp1;

import java.util.Scanner;

public class FonctionAbsolue {

	public static void main(String[] args) {

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
