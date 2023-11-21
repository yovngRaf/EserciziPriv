package its.esercizipriv;
import java.util.Scanner;

public class Controlloprimi {

	public static void main(String[] args) {
        int n, div = 1, conta = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Inserisci un numero: ");
            n = scanner.nextInt();
        } while (n < 1);
        while (conta <= 1 && div <= n / 2) {
            if (n % div == 0) {
                conta++;
            }
            div++;
        }
        if (conta == 1) {
            System.out.println("Il numero e' primo. ");
        } else {
            System.out.println("Il numero non e' primo. ");
        }
        scanner.close();
	}

}
