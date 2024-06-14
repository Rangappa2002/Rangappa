public class maxNumber {
    
    public static void main(String[] args) {
        int a = 80;
        int b = 50;
        int c = 30;
        int d = 40;

        int min1 = (a > b) ? a : b;
        int min2 = (b > c) ? c : d;
        int min = (min1 > min2) ? min1 : min2;

        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);
    }
}
