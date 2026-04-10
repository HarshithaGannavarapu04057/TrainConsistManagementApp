import java.util.*;

public class UC12 {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==============================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Tanker", "Petrol"));
        goodsBogies.add(new GoodsBogie("Box", "Electronics"));
        goodsBogies.add(new GoodsBogie("Tanker", "Gas"));
        goodsBogies.add(new GoodsBogie("Flatbed", "Steel"));

        // Display all bogies
        System.out.println("All Goods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g);
        }

        // ---- SAFETY COMPLIANCE CHECK ----
        System.out.println("\nSafety Violations:");

        boolean violationFound = false;

        for (GoodsBogie g : goodsBogies) {

            // Rule: Tanker should not carry Gas (example safety rule)
            if (g.type.equalsIgnoreCase("Tanker") &&
                    g.cargo.equalsIgnoreCase("Gas")) {

                System.out.println("❌ Violation: " + g);
                violationFound = true;
            }
        }

        if (!violationFound) {
            System.out.println("✅ No safety violations found");
        }
    }
}