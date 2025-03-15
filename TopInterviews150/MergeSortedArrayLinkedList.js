/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function (list1, list2) {
  if (list1 == null) return list2;
  if (list2 == null) return list1;

  let list = new ListNode(),
    refer = list;

  let left = list1;
  let right = list2;
  while (left && right) {
    if (right.val > left.val) {
      refer.next = left;
      left = left.next;
    } else {
      refer.next = right;
      right = right.next;
    }
    refer = refer.next;
  }
  refer.next = left || right;

  return list.next;
};
