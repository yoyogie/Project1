
public class uc4 {

    /**
     * Main method - Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Store banner lines inside a String array
        String[] banner = {

            String.join("  ", " ***** ", "*     *", "*     *", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", " ******", " ******"),
            String.join("  ", "*     *", "*     *", "*      ", "*      "),
            String.join("  ", "*     *", "*     *", "*      ", "*      "),
            String.join("  ", " ***** ", "*     *", "*      ", " ***** ")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}