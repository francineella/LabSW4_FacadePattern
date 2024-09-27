package FacadePattern;

public class Light implements HomeService {

    @Override
    public void turnOn(){
        System.out.println("Lights turned on..");
    }

    @Override
    public void turnOff(){
        System.out.println("Lights turned off..");
    }
}