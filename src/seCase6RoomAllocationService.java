import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class RoomAllocationService {

    HashMap<String, Set<String>> allocatedRooms = new HashMap<>();

    public void allocateRoom(String roomType, String roomId) {

        allocatedRooms.putIfAbsent(roomType, new HashSet<>());

        Set<String> rooms = allocatedRooms.get(roomType);

        if(rooms.contains(roomId)) {

            System.out.println("Room already allocated!");
            return;
        }

        rooms.add(roomId);

        System.out.println("Room allocated successfully: " + roomId);
    }
}

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        RoomAllocationService service = new RoomAllocationService();

        service.allocateRoom("Single","S101");
        service.allocateRoom("Single","S102");
        service.allocateRoom("Single","S101");
    }
}