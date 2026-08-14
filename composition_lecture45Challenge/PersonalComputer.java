public class PersonalComputer {
    private String state;
    //constructors:
    PersonalComputer(){
        this("Off "); // default state - Off
    }
    PersonalComputer(String state){
        this.state = state;
    }

    public void turnOnPersonalComputer(){
        this.state = "On";
        System.out.println("PersonalComputer is turned on");
    }
    public void turnOffPersonalComputer(){
        this.state = "Off";
        System.out.println("PersonalComputer is turned off");
    }
    public String getState(){
        return this.state;
    }
    public void setState(String state){this.state = state;}
}
