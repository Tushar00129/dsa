public class factorial {
    public static void main(String[] args) {
        int number = 5; // Change this value to compute factorial of a different number
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}