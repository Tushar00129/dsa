import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
          int dup=n;
          int sum=0;
         sum=sum+(int)Math.pow(n%10,3);
         n=n/10;    
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
            if (sum==dup) {
            System.out.println("armstrong");
        } else {
            System.out.println("Not armstrong");
        }
       System.out.println("armstrong of the number is: " + sum);
    }
}


