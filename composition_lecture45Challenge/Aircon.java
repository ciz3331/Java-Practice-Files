public class Aircon {
    private String state;
    //constructors:
    Aircon(){
        this("Off ");
    }
    Aircon(String state){
        this.state = state;
    }

    public void turnOnAircon(){
        this.state = "On";
        System.out.println("Aircon is turned on");
    }
    public void turnOffAircon(){
        this.state = "Off";
        System.out.println("Aircon is turned off");
    }

    public String getState(){
        return this.state;
    }
    public void setState(String state){this.state = state;}
}
