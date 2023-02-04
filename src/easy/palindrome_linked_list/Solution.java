package easy.palindrome_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head =
                new ListNode(1,
                    new ListNode(2, null));

        ListNode head2 =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(1))));

        System.out.println(isPalindrome(head));
        System.out.println(isPalindrome(head2));
    }

    public static boolean isPalindrome(ListNode head) {
        return true;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        if(this.next == null)
            return String.format("%s", this.val);
        return String.format("%s -> %s", this.val, this.next);
    }
}
