import java.util.Arrays;


public class Smallest {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 9};
        
        Arrays.sort(array);
        
        int smallest = array[0];
        
        System.out.println("Smallest element in the array: " + smallest);
    }
}
