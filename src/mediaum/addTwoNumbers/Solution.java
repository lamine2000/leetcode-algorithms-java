package mediaum.addTwoNumbers;

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

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;

        if(l1 != null && l2 != null){
            if(l1.val + l2.val > 9){
                l2.next = l2.next == null ? new ListNode(1) : new ListNode(++l2.next.val, l2.next.next);
                return new ListNode((l1.val + l2.val)%10, addTwoNumbers(l1.next, l2.next));
            }
            return new ListNode(l1.val + l2.val, addTwoNumbers(l1.next, l2.next));
        }

        ListNode notNullOne = l1 == null ? l2 : l1;
        if(notNullOne.val > 9){
            notNullOne.next = notNullOne.next == null ? new ListNode(1) : new ListNode(++notNullOne.next.val, notNullOne.next.next);
            return new ListNode(notNullOne.val%10, addTwoNumbers(null, notNullOne.next));
        }
        return new ListNode(notNullOne.val, addTwoNumbers(null, notNullOne.next));
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2, new ListNode(4, new ListNode(9, new ListNode(9))));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(addTwoNumbers(a, b));
    }
}