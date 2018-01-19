package tp1;

import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Afficher les nombres pairs entre 1 et 10
 * 
 *
 */

public class AfficherNombrePairEnBoucleForEtChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pair=-1;
		int impair=1;

		String lesChiffrePairs = "";
		String lesChiffreImpairs = "";
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				pair = i;
				lesChiffrePairs = lesChiffrePairs + pair + " ";
			} else {
				impair = i;
				lesChiffreImpairs = lesChiffreImpairs + impair + " ";
			}
		}

		System.out.println("les chiffres pairs sont " + lesChiffrePairs);
		System.out.println("les chiffres impairs sont " + lesChiffreImpairs); 
		
	}

}
