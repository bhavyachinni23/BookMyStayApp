import java.util.HashMap;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    public void displayInventory() {

        System.out.println("Current Room Inventory");

        for (String room : inventory.keySet()) {

            System.out.println(room + " Rooms Available: " + inventory.get(room));
        }
    }
}

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v3.0");

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();
    }
}