import java.util.*;

public class UC20
{

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("==============================================\n");

        // ---- BOGIE COLLECTION ----
        List<String> bogieIds = new ArrayList<>();

        // Uncomment below line to test NORMAL case
        // bogieIds.add("BG101");

        String searchId = "BG101";

        try {
            // ---- FAIL-FAST VALIDATION ----
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException(
                        "❌ Cannot perform search: No bogies available in the train.");
            }

            // ---- SEARCH LOGIC (Linear Search) ----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // ---- RESULT ----
            if (found) {
                System.out.println("✅ Bogie ID " + searchId + " FOUND");
            } else {
                System.out.println("❌ Bogie ID " + searchId + " NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}