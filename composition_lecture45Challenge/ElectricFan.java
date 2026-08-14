public class ElectricFan {
    private String state;
    //constructors:
    ElectricFan(){
        this("Off "); // default state - Off
    }
    ElectricFan(String state){
        this.state = state;
    }

    public void turnOnElectricFan(){
        this.state = "On";
        System.out.println("ElectricFan is turned on");
    }
    public void turnOffElectricFan(){
        this.state = "Off";
        System.out.println("ElectricFan is turned off");
    }
    public String getState(){
        return this.state;
    }
    public void setState(String state){this.state = state;}
}
