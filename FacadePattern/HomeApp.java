package FacadePattern;

public class HomeApp {
    public static void main(String[] args) {
        /*Light light = new Light();
        Tv tv = new Tv();
        AirConditioning airCon = new AirConditioning(); */
        HomeInterface hInterface = new HomeInterface(); 

        System.out.println("Services turned on.\n");
        hInterface.turnOnAll();
        System.out.println("\n");
        System.out.println("Services turned off.\n");
        hInterface.tunOffAll();
    }
    
}
