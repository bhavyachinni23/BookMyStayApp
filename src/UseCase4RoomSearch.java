import java.util.HashMap;

class InventoryService {

    private HashMap<String, Integer> inventory;

    public InventoryService() {

        inventory = new HashMap<>();

        inventory.put("Single", 5);
        inventory.put("Double", 0);
        inventory.put("Suite", 2);
    }

    public int getAvailability(String type) {

        return inventory.getOrDefault(type, 0);
    }
}

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("Room Search Service");

        InventoryService service = new InventoryService();

        if(service.getAvailability("Single") > 0)
            System.out.println("Single Room Available");

        if(service.getAvailability("Double") > 0)
            System.out.println("Double Room Available");

        if(service.getAvailability("Suite") > 0)
            System.out.println("Suite Room Available");
    }
}