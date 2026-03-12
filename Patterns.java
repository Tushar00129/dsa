public class Patterns {
    public static void main(String[] args) {

        int n = 4;
        int spaces = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            spaces -= 2;
            System.out.println();
        }
    }
}