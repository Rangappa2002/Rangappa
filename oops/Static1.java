
import java.util.*
;
import java.util.jar.Attributes.Name;public class Static1 {

    static {
        System.out.println("hii");
    }
   
    {
        String Name = "Arun";
        System.out.println(Name);
    }
    public static void main(String[] args) {
        System.out.println("");
        Static1 st = new Static1();
        
    }
}
