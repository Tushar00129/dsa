import java.util.Scanner;
public class removeelement {
    public static void main(String[] args) {}
    public static int removeElement(int[] nums, int val) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Read the size of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int k = 0; // Pointer for the next position to place a non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-val element at index k
                k++; // Move the pointer to the next position
            }
        }
        return k; // Return the new length of the array
    }
}