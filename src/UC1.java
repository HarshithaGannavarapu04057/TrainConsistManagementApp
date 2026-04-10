import java.util.*;

public class UC1 {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("==================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("==================================\n");

        // Create a dynamic List to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...\n");

        // Add sample bogies
        trainConsist.add("Engine");
        trainConsist.add("Passenger-1");
        trainConsist.add("Passenger-2");
        trainConsist.add("Sleeper-1");

        // Display train consist
        System.out.println("Current Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Add new bogie
        trainConsist.add("Cargo-1");
        System.out.println("\nAfter adding Cargo-1:");
        System.out.println(trainConsist);

        // Remove a bogie
        trainConsist.remove("Passenger-1");
        System.out.println("\nAfter removing Passenger-1:");
        System.out.println(trainConsist);

        // Search for a bogie
        String search = "Sleeper-1";
        if (trainConsist.contains(search)) {
            System.out.println("\nBogie found: " + search);
        } else {
            System.out.println("\nBogie not found");
        }
    }
}