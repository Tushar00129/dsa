import java.util.*;
    public static void main(String[] args) {
    public List(List<Integer>) fourSum(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array to handle duplicates and use two-pointer technique
           List<List<Integer>> result = new ArrayList<>();
     int sum = 0;
for (int i = 0; i < nums.length - 3; i++) {
    for(int j = i + 1; j < nums.length - 2; j++) {
        int left = j + 1;
        int right = nums.length - 1;
    if (i > 0 && nums[i] == nums[i - 1]) {
        continue; // Skip duplicate elements
        if (sum<target) {
            left++;
        } else {
            right--;
        }
 if (sum==target) {
    result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

    }
    }
}
 System.out.println(result);
}
}
}