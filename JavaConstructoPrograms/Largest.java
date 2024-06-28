
import java.util.Arrays;


public class Largest {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 9};
        
        Arrays.sort(array);
        
        int Largest = array[array.length - 1];
        
        System.out.println("Largest element in the array: " + Largest);
    }
}
