/**
 *  Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 *  The order of the elements may be changed. Then return the number of elements in nums 
 *  which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, 
    to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements 
    which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    
    Return k.
 *
 *
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function (nums, val) {
  let index = 0;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] != val) {
      // since we dont mind the values after the index length and only care about the 0th val to index th value im using this method
      // it check if the val match with nums[i] if it doesn't we increment the index++ and also swap the value of nums[i] with nums[index]
      // so that the first index (0 to index) values does not contain val
      nums[index] = nums[i];
      index++;
    }
  }

  return index;
};

console.log(removeElement([3, 2, 2, 3], 3));
