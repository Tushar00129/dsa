import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = Math.max(a, Math.max(b, c));
        System.out.println(greatest + " is the greatest");
    }
}
