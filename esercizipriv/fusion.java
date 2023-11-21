package its.esercizipriv;
import java.util.Arrays;

public class fusion {

	public static void main(String[] args) {
        int array[] = {1, 2, 3};
        int array2[] = {4, 5, 6};
        
    System.out.println("Prima: " + Arrays.toString(array) + " e " + Arrays.toString(array2));
        
        int result[] = new int[array.length + array2.length];
        int posizione = 0;
        
        for(int elemento : array){
            result[posizione] = elemento;
            posizione++;
        }
        
        for(int elemento : array2){
            result[posizione] = elemento;
            posizione++;
        }
    System.out.println("Dopo: " + Arrays.toString(result));

	}

}
