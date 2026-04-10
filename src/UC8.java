import java.util.*;
import java.util.stream.*;

public class UC8 {

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
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("==========================================\n");

        // Create list of passenger bogies (same style as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B6101", 72));
        bogies.add(new Bogie("B6102", 80));
        bogies.add(new Bogie("B6103", 65));
        bogies.add(new Bogie("B7001", 90));
        bogies.add(new Bogie("B8001", 50));

        // Display all bogies
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // ---- Filter using Streams ----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 70)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 70):");
        filteredBogies.forEach(System.out::println);

        // Count filtered bogies
        long count = bogies.stream()
                .filter(b -> b.capacity > 70)
                .count();

        System.out.println("\nNumber of high-capacity bogies: " + count);
    }
}