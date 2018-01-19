package questionnaire;

import java.util.Scanner;

public class Question {
	// Je déclare ma classe (moule) question et ses attributs
	String question;
	int idQ;
	int bonneReponse;

	// je déclare mon constructeur, qui appellera ses attributs
	public Question(int id, int bRepon, String quest) {
		idQ = id;
		bonneReponse = bRepon;
		question = quest;

	}

	public static void main(String args[]) {

	}
}