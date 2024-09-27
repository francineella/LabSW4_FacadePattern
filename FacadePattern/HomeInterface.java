package FacadePattern;

public class HomeInterface {
    private Light light;
    private Tv tv;
    private AirConditioning airCon;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new Tv();
        this.airCon = new AirConditioning();
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airCon.turnOn();
    }

    public void tunOffAll(){
        light.turnOff();
        tv.turnOff();
        airCon.turnOff();
    }

}