/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function (nums, target) {
  let left = 0,
    right = nums.length;

  while (left <= right) {
    let middle = Math.floor((left + right) / 2);
    let currentMiddle = nums[middle];

    if (currentMiddle == target) {
      return middle;
    } else if (currentMiddle < target) {
      left = middle + 1;
    } else {
      right = middle - 1;
    }
  }

  return left;
};

console.log(searchInsert([1, 3, 4, 5], 0));
console.log(searchInsert([1, 3, 4, 5], 7));
