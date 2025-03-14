
import java.util.Arrays;

/**
 * To solve this we have to use binary search 
 * Since we have to find the first and last instance of the target in the given array 
 * we need to use two binary search one for finding the first instance and 
 * the second one for finding the last instance of the target in the array
 * 
 * in the first binary search if we find the target we update the value of first variable if not it will be -1
 * if we find it instead of exiting out of the loop 
 * we have to move from middle to the left as we need to find the first instance of the target in the array right = middle - 1
 * 
 * in the second binary search if we find the target we update the value of the last variable and then move to the right half of the array
 * as we need to find the last instance of the given target
 * 
 */
class FirstAndLastInstanceInSortedArrayWithLogN {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        int first = -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int middle = (left + right) / 2;
            // 4 / 2 => 2 
            int currentMiddle = nums[middle];

            if(currentMiddle == target) {
                first = middle;
                right = middle - 1;
            }else if(currentMiddle < target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        int last = -1;
        left = 0;
        right = nums.length - 1;
        while(left <= right) {
            int middle = (left + right) / 2;
            int currentMiddle = nums[middle];
            if(currentMiddle == target) {
                last = middle;
                left = middle + 1;
            }else if(currentMiddle < target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        result[0] = first;
        result[1] = last;

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int target = 0;
        FirstAndLastInstanceInSortedArrayWithLogN s = new FirstAndLastInstanceInSortedArrayWithLogN();
        int[] result = s.searchRange(nums, target);
        System.out.println("Result " + Arrays.toString(result));

    }
}