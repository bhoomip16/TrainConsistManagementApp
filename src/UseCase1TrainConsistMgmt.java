import java.util.ArrayList;
import java.util.List;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ===========================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and 
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {
        // 1. Display welcome banner[span_0](start_span)[span_0](end_span)
        System.out.println("=========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=========================================\n");

        // 2. Create a dynamic list to store train bogies using ArrayList[span_1](start_span)[span_1](end_span)
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial consist information[span_2](start_span)[span_2](end_span)
        System.out.println("Train initialized successfully...");

        // 4. Display the initial bogie count using size()[span_3](start_span)[span_3](end_span)
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // 5. Print the current state (content) of the train[span_4](start_span)[span_4](end_span)
        System.out.println("Current Train Consist: " + trainConsist);

        // 6. Final status message[span_5](start_span)[span_5](end_span)
        System.out.println("System ready for operations...");
    }
}