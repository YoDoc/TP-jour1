package tp1;

/**
 * Multiplier par additions successives avec While le 3x7 Donc je dois ajouter 7
 * fois le nombre 3
 * 
 * 
 * 
 *
 *
 */

public class MultiplicationParAdditionsEnWhile {

	public static void main(String[] args) {
		int nombre = 3;
		int multiplicateur = 7;		
		int somme = 0;
		int i = 0;
		// Attention j'avais gourré, j'avais fait somme = nombre + nombre !
		// et Attention il me faut multiplicateur -1 car on commence à ajouter alors que i=0	
		while (i <= multiplicateur -1) {
			somme = somme + nombre;
			i ++;
		}
		System.out.println(somme);

		int n = 3;
		int m = 7;
		int resultat = 0;
		
		while (m !=0) {
			resultat = resultat + n;
			m --;	
		}
		System.out.println(resultat);
	}

}
