public class constructor {

    String ProductName ;
    int Age;
    float Salary;
    
    public constructor(String Name, int age){
        ProductName = Name;
        Age = age;

    }
    public constructor(float salary){
        Salary = salary;
    }
    public static void main(String[] args) {
        constructor cc1 = new constructor("Arun",55 );
        constructor cc2 = new constructor(29000);
        System.out.println(""+cc1.ProductName+" "+cc1.Age+" "+cc2.Salary);
    }
    

}
