package its.esercizipriv;
import java.util.Scanner;

public class ContVocCons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine();

        int vocali = 0;
        int consonanti = 0;

        inputString = inputString.toLowerCase(); // converti la stringa in minuscolo per semplificare il conteggio

        for (int i = 0; i < inputString.length(); i++) {
            char carattere = inputString.charAt(i);
            if (Character.isLetter(carattere)) {
                if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                    vocali++;
                } else {
                    consonanti++;
                }
            }
        }

        System.out.println("Numero di vocali: " + vocali);
        System.out.println("Numero di consonanti: " + consonanti);
        scanner.close();
	}

}
