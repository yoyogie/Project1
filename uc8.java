import java.util.HashMap;
import java.util.Map;

public class uc8 {
    private static final Map<Character, String[]> patternMap = new HashMap<>();
    static {
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
    public static void renderBanner(String input) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : input.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}