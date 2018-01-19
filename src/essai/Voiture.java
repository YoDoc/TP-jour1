package essai;

public class Voiture {

// La classe voiture a un attribut marque
	String marque;

// Je veux que ma voiture ait des roues 
// Je crée la classe Roue

	Roue [] roues; // j'ai une variable qui s'appelle qui est un tableau de Roue 
	
	
	
	
	
// Je crée une fonction objet donc pas "static" mais "void" dont le nom est
// "afficherMarque"
// Le terme void est pour "procédure"
// Cette fonction ne prend pas de paramètres
	public void afficherMarque() {
		System.out.println(marque); // Je lui demande de m'afficher la marque (qui pour le moment de vaut rien).

	}

}
