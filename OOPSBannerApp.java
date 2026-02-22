/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store
 * banner lines and iterating through them using a for-each loop,
 * eliminating repetitive print statements.
 *
 * @author Developer
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create array to store banner lines
        String[] lines = new String[7];

        lines[0] = String.join("   ", " *** ", " *** ", "*****", "*****");
        lines[1] = String.join("   ", "*   *", "*   *", "*    *", "*    ");
        lines[2] = String.join("   ", "*   *", "*   *", "*    *", "*    ");
        lines[3] = String.join("   ", "*   *", "*   *", "*****", "*****");
        lines[4] = String.join("   ", "*   *", "*   *", "*    ", "    *");
        lines[5] = String.join("   ", "*   *", "*   *", "*    ", "    *");
        lines[6] = String.join("   ", " *** ", " *** ", "*    ", "*****");

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}