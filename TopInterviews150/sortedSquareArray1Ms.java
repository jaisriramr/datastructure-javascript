
import java.util.Arrays;

class SortedSquareArray {
    public String sort(int[] nums) {
        int left = 0, right = nums.length - 1, index = nums.length - 1;
        int[] result = new int[nums.length];

        while(left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            }else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return Arrays.toString(result);
    }

    public static void main(String[] args) {
        SortedSquareArray s = new SortedSquareArray();
        int[] nums = {-7,-3,2,3,11};
        System.out.println(s.sort(nums));
    }
}