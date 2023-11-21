package its.esercizipriv;
import java.util.Scanner;

public class indovinanumero {

	public static void main(String[] args) {
        int numeroCasuale = (int) (Math.random() * 100) + 1;

        System.out.println("Indovina il numero tra 1 e 100!");

       
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("Indovina il numero: ");
            int numeroIndovinato = scanner.nextInt();

            if (numeroIndovinato == numeroCasuale) {
                System.out.println("Bravo, hai indovinato!");
                break;
            } else if (numeroIndovinato < numeroCasuale) {
                System.out.println("Troppo basso! Prova di nuovo.");
            } else {
                System.out.println("Troppo alto! Prova di nuovo.");
            }
        }

        
        scanner.close();

	}

}
