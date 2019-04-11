package model;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode(0);
        ListNode current = sumNode; // Initialize current node to dummy head of the returning list.
        int carry = 0; // Initialize carry to 0.
        ListNode p = l1; // Initialize p to head of l1.
        ListNode q = l2; // Initialize q to head of l2.

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0; // Set x to node p's value. If p has reached the end of l1, set to 0.
            int y = (q != null) ? q.val : 0; // Set y to node q's value. If q has reached the end of l2, set to 0.
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10); // Create a new node with the digit value of (sum mod 10) and set it to current node's next.
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return sumNode.next;


    }
}
