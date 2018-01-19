package questionnaire;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {

		System.out.println("Bienvenue dans notre Questionnaire");
		
		// je crée un questionnaire (qnnaire) donc new questionnaire
		Questionnaire qnnaire = new Questionnaire();
		// dans ce qnnqire je lui dit que la liste des question posées (qui est dans la classe Questionnaire
		// est égale à 1 (pour le moment)
		qnnaire.listQuestionPosees = 1;
		// dans ce qnnqire je lui dit que le contenu des question est le contenu du tableau question, à l'indice 1
		qnnaire.contenuQuestion = new Question[1];
		// je définie la question q1 comme étant
		Question q1 = new Question(1 , 4, "Quelle est la couleur du cheval blanc d'Henri IV?");
		
		qnnaire.contenuQuestion[0] = q1;
		
		System.out.println(Question.q1);
	}
}
