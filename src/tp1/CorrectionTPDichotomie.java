package tp1;

import java.util.Arrays;

public class CorrectionTPDichotomie {

	public static void main(String[] args) {
		int[] tab = { 0, 2, 5, 59, 79, 101 };
		int valeurRecherchee = 0;

		int indiceDebut = 0;
		int indiceFin = tab.length - 1;
		int indiceMid = indiceFin / 2;

		indiceMid = (indiceFin - indiceDebut) / 2;
		
		while (tab[indiceMid] != valeurRecherchee) {
			if (tab[indiceMid] > valeurRecherchee) {

				indiceFin = indiceMid -1;
				indiceMid = (indiceFin + indiceDebut)/2;
				// terminee

			} else {

				indiceDebut = indiceMid + 1;

			}
			// changer l'espace de recherche, modifier indice debut ou fin
			// cherche à nouveau

		}
		
		System.out.println("la valeur à l'indice vaut" + indiceMid + tab[ind]);	
		}

}
