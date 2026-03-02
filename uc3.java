/**
 * OOPSBannerApp - UC3 Implementation
 * Displays the word "OOPS" as a 7-line ASCII banner
 * using String.join() for better memory efficiency.
 *
 * @author Kartik
 * @version 3.0
 */
public class uc3 {

    /**
     * Main method - Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                " ******",
                " ******"));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                " ******",
                " ******"));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "*      "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "*      "));

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                "*      ",
                "*      "));
    }
}