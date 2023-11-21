package its.esercizipriv;
import java.util.Scanner;

public class sumnumeri {

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        int n = 5;
        int count = 1;
        int somma = 0;
        int num;
        
        for(count=1; count<=n; count++){
            System.out.println("Inserisci numero: ");
            num = scanner.nextInt();
            somma = somma + num;
        }
        System.out.println("La somma e': "+ somma);
        }

	}

}
