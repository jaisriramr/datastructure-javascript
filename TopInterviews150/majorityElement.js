var majorityElement = function (nums) {
  let count = 0;
  let element;

  for (let i = 0; i < nums.length; i++) {
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
};

console.log(majorityElement([2, 2, 1, 1, 1, 2, 2]));
