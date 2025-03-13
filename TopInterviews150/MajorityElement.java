
import java.util.*;

/**
 * Uses Moores voting algorithm
 */
class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
