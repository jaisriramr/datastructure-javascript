/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicatesTwoPointer = function (nums) {
  let k = 0; // Position to place the next valid number
  for (let num of nums) {
    if (k < 2 || num != nums[k - 2]) {
      // since we allow two duplicate instance we start with k being less than 2 and num is not equal to num[k - 2]
      nums[k] = num;
      k++;
    }
  }

  return nums;
};

console.log(removeDuplicatesTwoPointer([0, 0, 1, 1, 1, 1, 2, 3, 3]));
