package tp1;

/**
 * cout 150mE semaine
 * 
 *
 */
public class FilmRentable {

	public static void main(String[] args) {

		double recetteEnCours = 31000000;
		int cout = 150000000;
		int semaineUne = 31000000;
		int semaine = 1;
		double recetteSemaineEnCours = (semaineUne * 0.8);

		System.out.println("semaine: " + semaine + " la recette en cours est de " + recetteEnCours);

		while (recetteEnCours < cout) {
			recetteEnCours = recetteEnCours + recetteSemaineEnCours;
			recetteSemaineEnCours = (0.8 * recetteSemaineEnCours);
			semaine++;

			System.out.println("semaine: " + semaine + " la recette de cette semaine est de " + recetteSemaineEnCours);

		}

		System.out.println("le film est rentable au bout de " + semaine + " semaines.");

	}

}
