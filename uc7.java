public class uc7 {
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] patterns = {

            new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                    " ******",
                    "*     *",
                    "*     *",
                    " ******",
                    "*      ",
                    "*      ",
                    "*      "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ******",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ******"
            })
        };

        String input = "OOPS";
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : input.toCharArray()) {

                for (CharacterPatternMap cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        lineBuilder.append(cp.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(lineBuilder);
        }
    }
}