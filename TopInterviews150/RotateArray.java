
import java.util.Arrays;

class RotateArray {

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1); // reverse the entire array
        reverse(nums, 0, k - 1); // reverse from 0 to k - 1; rotate the first 0 to k - 1;
        reverse(nums, k, nums.length - 1); // reverse from k to length of the nums
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        r.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        //expected [5,6,7,1,2,3,4]
    }

}
