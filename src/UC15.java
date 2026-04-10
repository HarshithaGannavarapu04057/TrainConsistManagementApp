import java.util.*;

public class UC15 {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---- GOODS BOGIE MODEL ----
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {

            // Rule: Rectangular bogie cannot carry Petroleum
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe cargo assignment: " + shape + " -> " + cargo);
            }

            this.cargo = cargo;
            System.out.println("✅ Assigned: " + shape + " -> " + cargo);
        }

        @Override
        public String toString() {
            return shape + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC15 - Cargo Safety Validation (Runtime Exception)");
        System.out.println("==============================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        bogies.add(b1);
        bogies.add(b2);

        // ---- ASSIGN CARGO ----
        try {
            b1.assignCargo("Oil");          // valid
            b2.assignCargo("Petroleum");   // ❌ will throw exception
        } catch (CargoSafetyException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }

        // Program continues
        System.out.println("\nFinal Bogie Status:");
        for (GoodsBogie g : bogies) {
            System.out.println(g);
        }
    }
}