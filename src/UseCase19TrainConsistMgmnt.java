/**
 * =========================================================================
 * MAIN CLASS - UseCase19TrainConsistMgmnt
 * =========================================================================
 * * Use Case 19: Binary Search for Bogie ID (Optimized Searching)
 * * Description:
 * This class demonstrates searching for a specific bogie ID 
 * using the optimized Binary Search algorithm.
 * * At this stage, the application:
 * - Ensures bogie IDs are sorted (Precondition) [cite: 19]
 * - Initializes low and high indexes [cite: 19]
 * - Uses a divide-and-conquer strategy [cite: 19]
 * - Compares search key using compareTo() [cite: 19]
 * - Displays the result [cite: 19]
 * * This maps optimized O(log n) searching performance[cite: 19].
 * * @author Developer
 * @version 19.0
 */

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=================================================");
        System.out.println();

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchId = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }
        System.out.println("\n");

        int low = 0;
        int high = bogieIds.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = searchId.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                foundIndex = mid;
                break;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Bogie " + searchId + " found at index " + foundIndex + ".");
        } else {
            System.out.println("Bogie " + searchId + " not found in train consist.");
        }

        System.out.println();
        System.out.println("UC19 search completed...");
    }
}