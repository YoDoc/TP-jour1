/**
 *  Algo qui demande ton age et te donne ton année de naissance
 */

package tp1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TP4AnneeDeNaissance {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Donne moi ton age");
		int age = userInput.nextInt();
		
		 Calendar calendar = new GregorianCalendar();
		 Date now = new Date();
		 calendar.setTime(now);
		 
		 // a revoir ci dessous 
		
		 System.out.println(calendar.get(Calendar.YEAR)-age);
		 
		
		userInput.close();	
		
	}
}
