import java.util.*;
import java.util.stream.*;

public class UC10 {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("==========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- AGGREGATE USING REDUCE ----
        // map() extracts capacity from Bogie
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, (a, b) -> a + b);

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}