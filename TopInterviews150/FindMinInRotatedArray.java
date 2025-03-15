public class FindMinInRotatedArray {
    
    public int search(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int middle = left + (right - left) / 2;
            int currentMiddle = nums[middle];
            int target = nums[right];

            if(currentMiddle > target) {
                left = middle + 1;
            }else{
                right =middle;
            }

        }

        return nums[left];
    }

    public static void main(String[] args) {
        FindMinInRotatedArray f = new FindMinInRotatedArray();
        int[] nums = {3,4,5,0,1,2};
        System.out.println("Result " + f.search(nums));

    }
}
