public class Television {
    private String state;
    //constructors:
    Television(){
        this("Off "); // default state - Off
    }
    Television(String state){
        this.state = state;
    }

    public void turnOnTelevision(){
        this.state = "On";
        System.out.println("PersonalComputer is turned on");
    }
    public void turnOffTelevision(){
        this.state = "Off";
        System.out.println("PersonalComputer is turned off");
    }
    public String getState(){
        return this.state;
    }
    public void setState(String state){this.state = state;}
}
