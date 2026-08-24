public class PalindromicLinkedList {
    public boolean isPalindrome(ListNode head) {

        // Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Compare first half and reversed second half
        ListNode firstList = head;
        ListNode secondList = prev;

        while (secondList != null) {
            if (firstList.val != secondList.val) {
                return false;
            }

            firstList = firstList.next;
            secondList = secondList.next;
        }

        return true;
    }
}
