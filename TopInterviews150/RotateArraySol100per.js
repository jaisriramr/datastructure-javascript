var RotateArray = function (nums, k) {
  k = k % nums.length;

  const index = nums.length - k; // length of the array - k
  const arr = nums.splice(index); // deletes from given index to the length of the arr and returns it
  nums.unshift(...arr); // unshifts the arr values into nums
};
