class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode left = l1;
        ListNode right = l2;
        int reminder = 0;
        ListNode result = new ListNode(), refer = result;
        
        while(left != null || right != null) {
            int rightVal = (right != null) ? right.val : 0;
            int leftVal = (left != null) ? left.val : 0;
            int sum = (reminder + leftVal + rightVal) % 10;

            ListNode s = new ListNode(sum);
            
            refer.next = s;
            refer = refer.next;

            reminder = (reminder + leftVal + rightVal) / 10;

            if(left != null) left = left.next;
            if(right !=null) right = right.next;
        }

        if(reminder != 0) {
            ListNode s = new ListNode(reminder);
            refer.next = s;
            refer = refer.next;
        }

        return result.next;

    }
}