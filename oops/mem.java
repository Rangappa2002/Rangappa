public class mem {
    int num = 10;

    public void display(int num){
        this.num = num;
    }
public static void main(String[] args) {
    mem m = new mem();
    m.display(45);
    System.out.println(""+m.num);
}
}
