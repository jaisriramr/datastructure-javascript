/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Initialize a dummy node to serve as the starting point of the merged list
        ListNode list = new ListNode(), reference = list; 
        
        // Create local pointers for traversing list1 and list2
        ListNode left = list1; 
        ListNode right = list2; 

        while (left != null && right != null) {
            if (right.val > left.val) {
                // Since left's value is smaller, add it to the merged list
                reference.next = left;
                left = left.next; // Move left forward
            } else {
                // Since right's value is smaller or equal, add it to the merged list
                reference.next = right;
                right = right.next; // Move right forward
            }
            // Move the reference pointer forward to continue building the list
            reference = reference.next;
        }

        // Attach the remaining non-null list (if any) to the merged list
        reference.next = (left != null) ? left : right;

        // Since we used a dummy node at the beginning, return the merged list starting from list.next
        return list.next;
    }
}
