package FacadePattern;

public class Tv implements HomeService {

    @Override
    public void turnOn(){
        System.out.println("Television turned on..");
    }

    @Override
    public void turnOff(){
        System.out.println("Television turned off..");
    }
}