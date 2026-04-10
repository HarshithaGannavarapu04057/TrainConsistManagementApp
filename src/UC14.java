import java.util.*;
class UseCase14TrainConsistMgmnt {

    // ---- CUSTOM EXCEPTION ----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---- PASSENGER BOGIE MODEL ----
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // Validation (Fail-Fast)
            if (capacity <= 0 || capacity > 100) {
                throw new InvalidCapacityException(
                        "Invalid capacity for " + type + ": " + capacity);
            }

            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC14 - Custom Exception for Capacity Validation");
        System.out.println("==============================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        // ---- SAFE CREATION ----
        try {
            bogies.add(new PassengerBogie("Sleeper", 72));   // valid
            bogies.add(new PassengerBogie("AC Chair", 56));  // valid

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("General", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("❌ Exception Caught: " + e.getMessage());
        }

        // Program continues safely
        System.out.println("\nValid Bogies Created:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}