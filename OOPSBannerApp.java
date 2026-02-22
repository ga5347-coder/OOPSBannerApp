/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 *
 * This class prints the OOPS banner using the String.join()
 * method to improve readability and efficiency.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("   ",
                "  ***  ",
                "  ***  ",
                " ***** ",
                " ***** "));

        System.out.println(String.join("   ",
                " *   * ",
                " *   * ",
                " *    *",
                " *     "));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                " *    *",
                " *     "));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                " ***** ",
                " ***** "));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                " *     ",
                "     * "));

        System.out.println(String.join("   ",
                " *   * ",
                " *   * ",
                " *     ",
                "     * "));

        System.out.println(String.join("   ",
                "  ***  ",
                "  ***  ",
                " *     ",
                " ***** "));
    }
}