import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.0);

        List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxfordGuest, cambridge, victoria, oxford));

        //If we run the application, before the comparator,
        // they're being sorted in their natural order.

                    //rooms.sort(Comparator.naturalOrder());

        //r to use the new comparator that we built. we're sorting in ascending order by the room's daily rate
        rooms.sort(Room.RATE_COMPARATOR);


        rooms.stream()
                .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));






    }

}
