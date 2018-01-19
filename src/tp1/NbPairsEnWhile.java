package tp1;

/**
 * Afficher les nombres pairs entre 1 et 10
 * 
 * 
 */

public class NbPairsEnWhile {

	public static void main(String[] args) {
		int i = 0;
		String pairs = "";

		while (i <= 10) {
			if (i % 2 == 0) {
				pairs = pairs + i;
			}
			i++;
		}
		System.out.println("de 0 à 10, les chiffres pairs sont " + pairs);

	}

}
