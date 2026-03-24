abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;
    
    public Room(int numberOfBeds, int squareFeet, double pricePerNight){
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;

    }
    public void displayRoomDetails(){
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet +" sqft");
        System.out.println("Price Per Night: " + pricePerNight);
        
    }
}

class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 250, 1500.0); 
        System.out.println("Single room");
    }
}
class DoubleRoom extends Room {

    public DoubleRoom() { 
        super(2, 400, 2500.0); 
        System.out.println("Double room");
    }
}

class SuiteRoom extends Room {

    public SuiteRoom() { 
        super(3, 750, 5000.0); 
        System.out.println("Suite Room");
    }
}

public class UseCase2RoomInitialization {
    public static void main(String[] args) {
        System.out.println("Hotel Room Initialization");
        SingleRoom obj1 = new SingleRoom();
        obj1.displayRoomDetails();
        DoubleRoom obj2 = new DoubleRoom();
        obj2.displayRoomDetails();
        SuiteRoom obj3 = new SuiteRoom();
        obj3.displayRoomDetails();
    }
}