import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */
public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {
        // Initializing the Header
        System.out.println("==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================\n");

        // CREATE: Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD: Attaching new bogies to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // READ: Displaying the list after insertion
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // DELETE: Removing a specific bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // SEARCH: Checking if a specific bogie exists
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper);
        System.out.println();

        // Final State
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
        System.out.println();

        System.out.println("UC2 operations completed successfully...");
    }
}
