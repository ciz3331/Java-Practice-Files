public class Room {
    public Aircon aircon;
    private Bed bed;
    private ElectricFan electricFan;
    private PersonalComputer personalComputer;
    private Television television;

    //constructor:
    Room(Aircon aircon, Bed bed, ElectricFan electricFan, PersonalComputer personalComputer, Television television){
        this.aircon = aircon;
        this.electricFan = electricFan;
        this.personalComputer = personalComputer;
        this.television = television;
        this.bed = bed;
    }
    //getters of objects
    public Aircon getAircon(){
        return this.aircon;
    }
    public Bed getBed(){
        return this.bed;
    }
    public ElectricFan getElectricFan(){
        return this.electricFan;
    }
    public PersonalComputer getPersonalComputer(){
        return this.personalComputer;
    }
    public Television getTelevision(){
        return this.television;
    }

    public void turnAircon(String turn){
        if(turn == "On"){
            getAircon().setState("On");
        }
        else if(turn == "Off"){
            this.aircon.setState("Off");
        }
    }

    public void turnOnLahat(){
        this.aircon.setState("On");
        this.television.setState("On");
        this.personalComputer.setState("On");
        this.electricFan.setState("On");
    }
    public void turnOffLahat(){
        this.aircon.setState("Off");
        this.television.setState("Off");
        this.personalComputer.setState("Off");
        this.electricFan.setState("Off");
    }
    public void listState(){
        System.out.println("Ang aircon ay naka: " +this.aircon.getState());
        System.out.println("Ang electric fan ay naka: " +this.electricFan.getState());
        System.out.println("Ang PC ay naka: " +this.personalComputer.getState());
        System.out.println("Ang TV ay naka: " +this.television.getState());
    }

}
