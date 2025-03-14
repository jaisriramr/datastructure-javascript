import java.util.*;

class FirstAndLastInstanceInSortedArrayWithON {

    public int[] searchInstaces(int[] nums, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[1] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FirstAndLastInstanceInSortedArrayWithON s = new FirstAndLastInstanceInSortedArrayWithON();
        int[] nums = {1, 1,1};
        int target = 1;
        int[] result = s.searchInstaces(nums, target);
        System.out.println("Result " + Arrays.toString(result));
    }
}
