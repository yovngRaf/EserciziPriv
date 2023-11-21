package its.esercizipriv;
import java.util.Scanner;

public class InvStringa {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String str = input.nextLine();
        
        // Inverti
        String invertita = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertita += str.charAt(i);
        }
        
        // Stampa
        System.out.println("Inversione:" + invertita);
        input.close();
	}

}
