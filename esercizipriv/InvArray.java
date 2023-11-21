package its.esercizipriv;
import java.util.Arrays;

public class InvArray {

	public static void main(String[] args) {
        String array[] = {"1", "2", "3", "4", "5"};
        	System.out.println(Arrays.toString(array));
        
    for (int i = 0; i < array.length / 2; i++) {
        String t = array[i];
        	array[i] = array[array.length - 1 - i];
        		array[array.length - 1 - i] = t;
    
}
System.out.println(Arrays.toString(array));

	}

}
