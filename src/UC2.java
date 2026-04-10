import java.util.*;

public class UC2 {

    public static void main(String[] args) {

        // Display UC2 banner
        System.out.println("==================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("==================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the train

        passengerBogies.add("Passenger-1");
        passengerBogies.add("Passenger-2");
        passengerBogies.add("Passenger-3");
        passengerBogies.add("Sleeper-1");

        // Display added bogies
        System.out.println("Passenger bogies added successfully!\n");

        System.out.println("Current Passenger Bogies:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}