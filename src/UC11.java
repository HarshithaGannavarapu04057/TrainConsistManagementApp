import java.util.*;
import java.util.regex.*;

public class UC11{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ----
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "[A-Z]{3}-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Match input
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID ✅");
        } else {
            System.out.println("Invalid Train ID ❌");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code ✅");
        } else {
            System.out.println("Invalid Cargo Code ❌");
        }

        scanner.close();
    }
}
