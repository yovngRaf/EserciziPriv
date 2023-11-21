package its.esercizipriv;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Inserisci numero: ");
        int n = input.nextInt();
        
        long fattoriale = 1;
        for (int i = 1; i <= n; i++) {
            fattoriale *= i;
        }

        
        System.out.println("Il fattoriale di " + n + " e' " + fattoriale);
        input.close();
	}
	
}
