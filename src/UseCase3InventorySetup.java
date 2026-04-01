package BookMyStayApp.src;

import java.util.HashMap;
import java.util.Map;

class Room {
    private String type;
    private int beds;
    private int size;
    private double price;

    public Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }
    public int getBeds() {
        return beds;
    }
    public int getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
}

class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}


public class UseCase3InventorySetup {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();


        Room single = new Room("Single", 1, 250, 1500);
        Room doub = new Room("Double", 2, 400, 2500);
        Room suite = new Room("Suite", 3, 750, 5000);

        System.out.println("Hotel Room Inventory Status\n");


        System.out.println(single.getType() + " Room:");
        System.out.println("Beds: " + single.getBeds());
        System.out.println("Size: " + single.getSize() + " sqft");
        System.out.println("Price per night: " + single.getPrice());
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get(single.getType()));
        System.out.println();


        System.out.println(doub.getType() + " Room:");
        System.out.println("Beds: " + doub.getBeds());
        System.out.println("Size: " + doub.getSize() + " sqft");
        System.out.println("Price per night: " + doub.getPrice());
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get(doub.getType()));
        System.out.println();

        System.out.println(suite.getType() + " Room:");
        System.out.println("Beds: " + suite.getBeds());
        System.out.println("Size: " + suite.getSize() + " sqft");
        System.out.println("Price per night: " + suite.getPrice());
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get(suite.getType()));
    }
}