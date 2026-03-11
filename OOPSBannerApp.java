public class OOPSBannerApp {

    /*
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings
     */
    static class CharacterPatternMap {

        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to create CharacterPatternMap array
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        String[] oPattern = {
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        };

        String[] pPattern = {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };

        String[] sPattern = {
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   "
        };

        String[] spacePattern = {
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "
        };

        characterPatternMap[0] = new CharacterPatternMap('O', oPattern);
        characterPatternMap[1] = new CharacterPatternMap('P', pPattern);
        characterPatternMap[2] = new CharacterPatternMap('S', sPattern);
        characterPatternMap[3] = new CharacterPatternMap(' ', spacePattern);

        return characterPatternMap;
    }

    // Method to get pattern for character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }

    // Method to print message banner
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 9;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}