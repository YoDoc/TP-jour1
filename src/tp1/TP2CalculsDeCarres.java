package tp1; // localisation de mon package

import java.util.Scanner; // importer Scanner, à écrire avant la ligne classe
	
public class TP2CalculsDeCarres {	//C'est ma classe, elle décrit l'objet=recette
	
	public static void main(String[] args) { // c'est un main à toujours indiquer dans le langage pour le moment
	
	Scanner userInput = new Scanner(System.in); // créer un objet fonction scanner 
												// et affecté à la variable userInput
	
	System.out.println("saisi un truc"); // system.out.println pour l'affichage 
	 
	
	int value = userInput.nextInt();	//Affecte la valeur tapée par le user à value;
										// le nextInt dans la fonction Scanner
										// appelle la fonction NextInt de scanner
	
			
	System.out.println(value*value);	// system.out.println pour l'affichage
	
	userInput.close();				// userInput doit etre fermé

	}
}