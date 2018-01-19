package tp1;

public class Cercle {
	
	static double pi = 3.14; 
	// pi est une variable static càd une variable une variable d'objet
	// Une variable de classe serait Cercle.pi
	int rayon;
	
		public double calculerSurface () {
		return  rayon * rayon * Cercle.pi;
	}
	
}
