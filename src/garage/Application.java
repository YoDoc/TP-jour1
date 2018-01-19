package garage;

public class Application {

	public static void main (String[] args) {

		Voiture voiture;
		voiture = new Voiture();

		voiture.marque = "Opel";
		voiture.modele = "Corsa";

		Moteur m1 = new Moteur();
		m1.puissance = 90;

		voiture.moteur = m1;

		Roue roueAvantGauche = new Roue();
		Roue roueAvantDroit = new Roue();
		Roue roueArriereGauche = new Roue();
		Roue roueArriereDroit = new Roue();

		Roue[] roue = new Roue[4];

		roue[0] = roueAvantGauche;
		roue[1] = roueAvantDroit;
		roue[2] = roueArriereGauche;
		roue[3] = roueArriereDroit;
		
		voiture.roues = roue ;
		
	
		
		System.out.println(voiture.marque);
		
	}
}
