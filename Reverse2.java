import java.util.Scanner;
public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
          int dup=n;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
            if (dup==reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
       System.out.println("Reverse of the number is: " + reverse);
    }
}


