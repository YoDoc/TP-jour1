package tp1;

public class ExDeFonction {

	public static void main(String[] args) {

		// Je suis dans le main, je d�clare mes variables
		// ici ce sont des entiers donc int

		int a = -2;
		int b = 3;
		// je d�clare le r�sultat de ma fonction (qui suit)

		int valeurAbsolueDeA = calculerValeurAbsolue(a);

		// j'affiche son r�sultat

		System.out.println("la valeur absolue de " + valeurAbsolueDeA + " est " + a);
	}

	// Ma Fonction
	// Je d�marre par public static (cest comme ca) puis int (car on calcule un
	// entier) puis son nom
	// puis d�clare sa variable de d�part

	public static int calculerValeurAbsolue(int entier) {
		// Sa fonction
		// si j'ai besoin d'une fonction de Math, commencer par taper math. et regarder
		// ce qui existe
		
		int valAbsolue;
		valAbsolue = Math.abs(entier);
		
		// ce qu'elle retourne
		return valAbsolue;
	}

}
