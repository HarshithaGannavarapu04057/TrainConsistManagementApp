import java.util.*;
import java.util.stream.*;

public class UC13
{

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==============================================\n");

        // Create large test dataset
        List<Bogie> bogies = new ArrayList<>();

        // Adding 10000 bogies
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", (i % 100) + 20));
        }

        // ---- LOOP APPROACH ----
        long startLoop = System.nanoTime();

        int totalLoop = 0;
        for (Bogie b : bogies) {
            totalLoop += b.capacity;
        }

        long endLoop = System.nanoTime();

        // ---- STREAM APPROACH ----
        long startStream = System.nanoTime();

        int totalStream = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        long endStream = System.nanoTime();

        // ---- RESULTS ----
        System.out.println("Total (Loop): " + totalLoop);
        System.out.println("Total (Stream): " + totalStream);

        System.out.println("\nTime taken (Loop): " + (endLoop - startLoop) + " ns");
        System.out.println("Time taken (Stream): " + (endStream - startStream) + " ns");
    }
}