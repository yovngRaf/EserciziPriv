
package its.esercizipriv;
import java.util.Scanner;

public class controllopd {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Inserisci numero: ");
	      int numero = scanner.nextInt();
	      
	      if((numero % 2) == 0){
	        System.out.println("Numero pari.");
	      }
	      else {
	        System.out.println("Numero dispari.");
	      }
	      scanner.close();
	  }

	}


