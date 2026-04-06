/**
 * =========================================================================
 * MAIN CLASS - UseCase20TrainConsistMgmnt
 * =========================================================================
 * * Use Case 20: Exception Handling During Search Operations
 * * Description:
 * This class demonstrates defensive programming by throwing an 
 * IllegalStateException if a search is attempted on an empty consist.
 * * At this stage, the application:
 * - Checks if the bogie collection is empty before searching
 * - Throws an IllegalStateException for invalid states
 * - Implements a Fail-Fast approach
 * - Provides meaningful error feedback
 * * This maps real-world defensive coding and state validation.
 * * @author Developer
 * @version 20.0
 */

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("=================================================");
        System.out.println();

        String[] bogieIds = {};
        String searchId = "BG309";

        try {
            performSearch(bogieIds, searchId);
        } catch (IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("UC20 search attempt completed...");
    }

    public static void performSearch(String[] bogieIds, String searchId) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Search failed: The train consist is empty. No bogies available to search.");
        }

        boolean found = false;
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " not found.");
        }
    }
}