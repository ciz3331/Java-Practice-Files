// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well

// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video

// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Main {
    public static void main(String[] args) {
        Aircon mainAircon = new Aircon();
        Bed mainBed = new Bed();
        ElectricFan mainElectricFan = new ElectricFan();
        PersonalComputer mainPersonalComputer = new PersonalComputer();
        Television mainTelevision = new Television();
        Room nakaOnNaba = new Room(mainAircon,mainBed, mainElectricFan, mainPersonalComputer, mainTelevision);

        nakaOnNaba.listState();
        nakaOnNaba.getAircon().setState("On");
        System.out.println();
        nakaOnNaba.listState();

        System.out.println();
        nakaOnNaba.aircon.setState("Off");
        System.out.println("Ang aircon ay naka: " +nakaOnNaba.aircon.getState());


    }
}