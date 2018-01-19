/**But: Trouver le plus grand nb d'un tableau, le mettre en fin et ensuite travailler sur le reste du tableau
 * 
 * 
 * Création d'un tableau, non trié c'est mieux
 * déclarer une variable qui est le plus grand nombre, et de son indice
 * Rechercher le plus grand nb et sa position
 * Inverser ce plus gd nb trouvé avec le dernier elmt du tableau
 * Réduire l'espace de recherche de 1, càd le tableau
 * Du coup, déclarer une variable de la dernière position (espace de recherche)
 * 
 * Affecter valeur aux variables: on peut déjà attribuer tab.length - 1 à la val de la dernière position
 * 
 * 
 * OK, alors
 * Recherche => Boucle for (i demare à 0; va jusque la dernière position donc <=; à chaque tour augmente dc ++)
 * ouverture crochets pour lui donner la recherche: 
 * IF: (comparer mon plus gd nb actuel à celui trouvé) {
 * si c'est plus grand, il le devient
 * on récupère le max et son indice=> 
 * 		LeplusGdNb = tab[i]
 * 		position = i
 * 
 * A ce moment on peut tester avec le tableau initial, puis genre ressortir les 2 valeurs ci dessus
 * 
 *  * Inverser ce plus gd nb trouvé avec le dernier elmt du tableau
 *   Avec une déclaration de variable temporaire
 *   
 *   et là on se rend compte qu'il faut dimininuer ta taille tableau => donc nouvelle boucle FOR autour
 *   
 *   On souhaite boucler tant que la der position n'est pas , donc inf ou égal
 *   
 *   Donc boucle FOR avec la variable qui bouge dans cette boucle est la derniere position qui descend de 1 à chaque tour
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
		
		// je définie la variable taille_tab qui est la taille max du tableau
		
		int taille_tab = tab.length;

		for (int fin_de_tab = taille_tab - 1; fin_de_tab > 0; fin_de_tab --) {

			// fin de temps que alors max<max possible et on récupère valeur et indice
			int valeurmax = 0;
			int indice = -1;
			
			// je déclare indice 0, il prend +1 tant qu'inf à la taille de fin de tab
			
				// 2eme boucle FOR
			
						for (int i = 0; i <= fin_de_tab; i++) {
							if (valeurmax < tab[i]) {
						indice = i;
						valeurmax = tab[i];
						}
					}
					
				// Fin 2eme boucle FOR
						
						
			// on a trouvé le plus grand nombre (max) et son indice (ind)
			// affecte le dernier emplacement à variable temporaire, pour écraser

			int temporaire = tab[fin_de_tab];
			tab[fin_de_tab] = tab[indice];
			tab[indice] = temporaire;

		}
		System.out.println(Arrays.toString(tab));

	}

}
