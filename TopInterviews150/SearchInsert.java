/*
 * In Sorted Array we go from left to right for asc;
 * So in this binary search if we find the element in the given array return its index;
 * if not return the left;
 * in sorted array we move from left to right to insert an element, 
 * so we return left if dont find target in the given array
 * 
 */
class SearchInsert {

    public int insert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int currentMiddle = nums[middle];
            if (currentMiddle == target) {
                return middle; 
            }else if (currentMiddle < target) {
                left = middle + 1; 
            }else {
                right = middle - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        SearchInsert search = new SearchInsert();
        int[] nums = {1,3,5,6};
        int target = 7;
        
        System.out.println("Result " + search.insert(nums, target));
    }
}
