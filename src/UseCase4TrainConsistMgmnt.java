import java.util.LinkedList;

/**
 * =====================================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * =====================================================================
 *
 * Use Case 4: Manage Train Sequence using LinkedList
 *
 * Description:
 * This class simulates the physical arrangement of a train.
 * Using LinkedList, we can efficiently add/remove bogies at the
 * head, tail, or middle of the consist.
 *
 * At this stage, the application:
 * - Maintains physical sequence (Order Preservation)
 * - Supports head/tail additions (addFirst/addLast)
 * - Supports middle insertions (add at index)
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC4 - LinkedList Train Sequence ");
        System.out.println("==============================================\n");

        // Create a LinkedList to represent the physical train consist
        LinkedList<String> consist = new LinkedList<>();

        // 1. Initial Assembly (Add bogies)
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist);

        // 2. Insert a Pantry Car at position 2 (Index 2)
        // LinkedList is efficient for middle insertions
        consist.add(2, "Pantry Car");
        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(consist);

        // 3. Remove the first and last bogie
        // Simulating detaching the Engine and the Guard bogie
        consist.removeFirst();
        consist.removeLast();

        // 4. Display the final ordered train consist
        System.out.println("\nFinal Consist (After removing head and tail):");
        System.out.println(consist);

        System.out.println("\nUC4 sequence management completed...");
    }
}
