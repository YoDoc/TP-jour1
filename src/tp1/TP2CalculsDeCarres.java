package tp1; // localisation de mon package

import java.util.Scanner; // importer Scanner, � �crire avant la ligne classe
	
public class TP2CalculsDeCarres {	//C'est ma classe, elle d�crit l'objet=recette
	
	public static void main(String[] args) { // c'est un main � toujours indiquer dans le langage pour le moment
	
	Scanner userInput = new Scanner(System.in); // cr�er un objet fonction scanner 
												// et affect� � la variable userInput
	
	System.out.println("saisi un truc"); // system.out.println pour l'affichage 
	 
	
	int value = userInput.nextInt();	//Affecte la valeur tap�e par le user � value;
										// le nextInt dans la fonction Scanner
										// appelle la fonction NextInt de scanner
	
			
	System.out.println(value*value);	// system.out.println pour l'affichage
	
	userInput.close();				// userInput doit etre ferm�

	}
}