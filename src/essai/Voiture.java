package essai;

public class Voiture {

// La classe voiture a un attribut marque
	String marque;

// Je veux que ma voiture ait des roues 
// Je cr�e la classe Roue

	Roue [] roues; // j'ai une variable qui s'appelle qui est un tableau de Roue 
	
	
	
	
	
// Je cr�e une fonction objet donc pas "static" mais "void" dont le nom est
// "afficherMarque"
// Le terme void est pour "proc�dure"
// Cette fonction ne prend pas de param�tres
	public void afficherMarque() {
		System.out.println(marque); // Je lui demande de m'afficher la marque (qui pour le moment de vaut rien).

	}

}
