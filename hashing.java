public class hashing {
    public static void main(String[] args) {

        int number = 5;
        int arr[] = {1, 1, 2, 4, 5};
        int cnt = 0;
         int hash[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        cnt = hash[number];
         System.out.println(cnt);
    }
        }



