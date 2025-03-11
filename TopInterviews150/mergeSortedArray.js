/**
 *  You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 *  and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 *
 * @param {*} nums1
 * @param {*} m
 * @param {*} nums2
 * @param {*} n
 * @returns
 */

function merge(nums1, m, nums2, n) {
  let result = [];
  let i = 0;
  let j = 0;

  nums1 = nums1.slice(0, m);

  while (i < nums1.length && j < nums2.length) {
    if (nums2[j] > nums1[i]) {
      result.push(nums1[i]);
      i++;
    } else {
      result.push(nums2[j]);
      j++;
    }
  }

  while (i < nums1.length) {
    result.push(nums1[i]);
    i++;
  }

  while (j < nums2.length) {
    result.push(nums2[j]);
    j++;
  }

  result.map((val, id) => (nums1[id] = val));
  return result;
}

console.log(merge([-1, 0, 0, 3, 3, 3, 0, 0, 0], 6, [1, 2, 2], 3));
