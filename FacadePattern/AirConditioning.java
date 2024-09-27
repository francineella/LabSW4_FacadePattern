package FacadePattern;

public class AirConditioning implements HomeService {

    @Override
    public void turnOn(){
        System.out.println("Airconditioning turned on..");
    }

    @Override
    public void turnOff(){
        System.out.println("Airconditioning turned off..");
    }
}