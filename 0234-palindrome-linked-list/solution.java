
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode copyHead = null, copyTail = null;

        while (temp != null) {
            ListNode node = new ListNode(temp.val);

            if (copyHead == null) {
                copyHead = node;
                copyTail = node;
            } else {
                copyTail.next = node;
                copyTail = node;
            }

            temp = temp.next;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        curr = prev;
        temp = copyHead;

        while (curr != null && temp != null) {
            if (curr.val != temp.val) {
                return false;
            }
            curr = curr.next;
            temp = temp.next;
        }

        return true;
    }
}

