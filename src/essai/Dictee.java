package essai;

public class Dictee {
	public static void main(String[] args) {

		System.out.println("Hello Buzu");
		// j'appelle la fonction afficher avec l'attribut à executer affiche
		afficher("Bonjour");

		// je déclare une variable a qui est une chaine de caractère et dont la valeur
		// est
		// initialisée à "HelloWorld" (on aurait pu le faire en 2 lignes: 1/

		String a = "HelloWorld";
		// je lui demande d'executer la methode affiche sur la variable a
		afficher(a);

		// je lui demande d'executer la methode "additionner" avec pour résultat
		// "resultat" que je déclare donc
		// Je demande son affichage
		int resultat = additionner(2, 3);
		System.out.println(resultat);

		// je lui demande d'executer la methode "multiplier" avec pour attribut 3 et 6

		double resultatMultiplication = multiplier(3, 6);

		// Maintenant j'appelle la fonction additionner qui est dans la classe Math en
		// lui affectant 5 et 6 en attributs
		Math.additionner(5, 6);

		Voiture v1; // Dans ce main, je déclare une variable de type Voiture (ce qui se peut car la
					// classe Objet existe)
		v1 = new Voiture(); // Je crée un objet v1 de type Voiture
		v1.marque = "Opel"; // j'attribue à mon objet v1 une marque "Opel"
		v1.afficherMarque(); // j'appelle la fonction afficherMarque pour l'objet v1

		Roue avG = new Roue(); // Je crée une roue
		avG.taille = 150; // elle a une taille
		Roue[] tab = new Roue[1];
		tab[0] = avG;

		Roue avantGauche = new Roue(); // Je crée une roue nommée avantGauche
		Roue avantDroit = new Roue(); // Je crée une roue nommée avantDroit
		Roue[] tableauDeRoues = new Roue[2]; // Je crée un tableau de roues contenant 2 objets roue
		tableauDeRoues[0] = avantGauche; // J'attribue avG à l'indice 0
		tableauDeRoues[1] = avantDroit;

	}

	// créer une fonction "afficher" ; pas de majuscule au nom de la fonction
	// Ma fonction commence toujours par public static
	// il me faut le void car elle ne renvoie rien
	// ma fonction renvoie une chaine de caractères donc "string" que je nomme
	// "texte"
	// => maintenant "texte" est connu, c'est ce qu'on appelle la portée de la
	// fonction "afficher"

	public static void afficher(String texte) {
		// je lui demande aussi à ma fonction de me faire une impression de cette chaine
		// de caractères
		System.out.println(texte);
	}

	// pour séparer 2 paramètres, c'est avec la virgule
	// Cette fonction "additionner" prend en variables deux entiers (b et c) et me
	// calcule "addition" qui est déclaré comme (b+c)
	// je lui demande ensuite de me retourner "addition",
	public static int additionner(int b, int c) {
		int addition = b + c;
		return addition;
	}

	// fonction donc "public static" puis "double" car le résultat est un double
	// puis son nom "multiplier" puis ses attributs (x, y)
	// Ma fonction "multiplier" aura pour résultat un double et pour attribut deux
	// doubles
	// Elle va calculer a fois b
	// Elle afficher la phrase et le resultat "multiplication"
	// Je finis par un return du résultat de la fonction
	// Cette commande return doit toujours etre la dernière ligne de la fonction

	public static double multiplier(double a, double b) {
		double multiplication = (a * b);
		System.out.println("Combien font " + a + " et " + b + "? C'est égal à " + multiplication);
		System.out.println("je multiplie  " + a + " et " + b + ". Son résultat est " + multiplication + ". Bingo?");
		return multiplication;

	}
}
