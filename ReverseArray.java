public class ReverseArray {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        reverse(arr);   // reversing array

        System.out.println("\nReversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}