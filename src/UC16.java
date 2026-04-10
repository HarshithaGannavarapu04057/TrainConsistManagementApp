public class UC16 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("====================================\n");

        // Create array of passenger bogie capacities
        int[] capacities = {72, 56, 26, 70, 68};

        // Display original order
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ---- BUBBLE SORT LOGIC ----
        for (int i = 0; i < capacities.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < capacities.length - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) break;
        }

        // Display sorted result
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}