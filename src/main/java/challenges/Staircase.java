package challenges;

public class Staircase {
    // Print a staircase of size n using # symbols and spaces.

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = n - i; j > 0; j--) {
                row += " ";
            }
            for (int k = 1; k <= i; k++) {
                row += "#";
            }
            System.out.println(row);
        }

    }
}
