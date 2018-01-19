/**But: Trouver le plus grand nb d'un tableau, le mettre en fin et ensuite travailler sur le reste du tableau
 * 
 * 
 * Cr�ation d'un tableau, non tri� c'est mieux
 * d�clarer une variable qui est le plus grand nombre, et de son indice
 * Rechercher le plus grand nb et sa position
 * Inverser ce plus gd nb trouv� avec le dernier elmt du tableau
 * R�duire l'espace de recherche de 1, c�d le tableau
 * Du coup, d�clarer une variable de la derni�re position (espace de recherche)
 * 
 * Affecter valeur aux variables: on peut d�j� attribuer tab.length - 1 � la val de la derni�re position
 * 
 * 
 * OK, alors
 * Recherche => Boucle for (i demare � 0; va jusque la derni�re position donc <=; � chaque tour augmente dc ++)
 * ouverture crochets pour lui donner la recherche: 
 * IF: (comparer mon plus gd nb actuel � celui trouv�) {
 * si c'est plus grand, il le devient
 * on r�cup�re le max et son indice=> 
 * 		LeplusGdNb = tab[i]
 * 		position = i
 * 
 * A ce moment on peut tester avec le tableau initial, puis genre ressortir les 2 valeurs ci dessus
 * 
 *  * Inverser ce plus gd nb trouv� avec le dernier elmt du tableau
 *   Avec une d�claration de variable temporaire
 *   
 *   et l� on se rend compte qu'il faut dimininuer ta taille tableau => donc nouvelle boucle FOR autour
 *   
 *   On souhaite boucler tant que la der position n'est pas , donc inf ou �gal
 *   
 *   Donc boucle FOR avec la variable qui bouge dans cette boucle est la derniere position qui descend de 1 � chaque tour
 *   

 * 
 */

package tp1;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class TP5TriParSelection {

	public static void main(String[] args) {
		// definition du tableau
		
		int[] tab = { -5, 2, 8, 18, 4, 3, 1, 14, 6, 7 };
		// sortie visuelle du tableau, noter qu'il fallait importer java.util.Arrays

		System.out.println(Arrays.toString(tab));
		
		// je d�finie la variable taille_tab qui est la taille max du tableau
		
		int taille_tab = tab.length;

		for (int fin_de_tab = taille_tab - 1; fin_de_tab > 0; fin_de_tab --) {

			// fin de temps que alors max<max possible et on r�cup�re valeur et indice
			int valeurmax = 0;
			int indice = -1;
			
			// je d�clare indice 0, il prend +1 tant qu'inf � la taille de fin de tab
			
				// 2eme boucle FOR
			
						for (int i = 0; i <= fin_de_tab; i++) {
							if (valeurmax < tab[i]) {
						indice = i;
						valeurmax = tab[i];
						}
					}
					
				// Fin 2eme boucle FOR
						
						
			// on a trouv� le plus grand nombre (max) et son indice (ind)
			// affecte le dernier emplacement � variable temporaire, pour �craser

			int temporaire = tab[fin_de_tab];
			tab[fin_de_tab] = tab[indice];
			tab[indice] = temporaire;

		}
		System.out.println(Arrays.toString(tab));

	}

}
