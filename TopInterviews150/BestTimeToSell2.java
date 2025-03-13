
class BestTimeToSell2 {

    public int maxProfit(int[] nums) {
        int maxPrice = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i + 1] > nums[i]) {
                maxPrice += nums[i + 1] - nums[i];
            }
        }
        return maxPrice;

    }

    public static void main(String[] args) {
        BestTimeToSell2 b = new BestTimeToSell2();
        int[] nums = {2, 1, 2, 1, 0, 0, 1};
        System.out.println(b.maxProfit(nums));
    }
}
