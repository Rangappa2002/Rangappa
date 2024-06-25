public class Mobile {
    private String brand;
    private double cost;

    public Mobile(String brand,double cost){
        this.brand = brand;
        this.cost = cost;
}

    public String getBrand(){
        return brand;
    }
    public double getCost(){
        return cost;
    }

   public static void main(String[] args){
    Mobile mob = new Mobile("Oppo F25 Pro 5G", 24999);

    System.out.println("Mobile Brand:"+mob.getBrand());
    System.out.println("Mobile Cost:"+mob.getCost());
   }
}