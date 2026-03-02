/**
 * OOPSBannerApp - UC5 Implementation
 * Displays the word "OOPS" as a 7-line ASCII banner
 * using compact array initialization with String.join().
 *
 * @author Kartik
 * @version 5.0
 */
public class uc5 {

    /**
     * Main method - Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize array in one compact statement
        String[] banner = {
            String.join("  ", " ***** ", " ***** ", " ******", " ******"),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", " ******", " ******"),
            String.join("  ", "*     *", "*     *", "*      ", "*      "),
            String.join("  ", "*     *", "*     *", "*      ", "*      "),
            String.join("  ", " ***** ", " ***** ", "*      ", "*      ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}