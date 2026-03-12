import java.util.Scanner;

public class MaxSumSubarrayK {

    public static int maxSum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int currentSum = 0;

            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];   // create array

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // take input
        }

        int k = 3;

        System.out.println("Maximum sum of subarray of size k = " + maxSum(arr, k));
    }
}