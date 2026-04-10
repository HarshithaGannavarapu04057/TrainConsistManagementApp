import java.util.*;

public class UC7 {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Display format
        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==========================================\n");

        // Create List of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // ---- Add Bogies ----
        bogies.add(new Bogie("B6101", 72));
        bogies.add(new Bogie("B6102", 80));
        bogies.add(new Bogie("B6103", 65));
        bogies.add(new Bogie("B7001", 90));

        // Display original list
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- Sort using Comparator (Ascending Capacity) ----
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity;
            }
        });

        // Display sorted list
        System.out.println("\nAfter Sorting (Ascending Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- Sort Descending ----
        Collections.sort(bogies, (b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nAfter Sorting (Descending Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}