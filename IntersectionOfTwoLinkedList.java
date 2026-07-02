public class IntersectionOfTwoLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */


        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            // Two pointers starting from each list
            ListNode pA = headA;
            ListNode pB = headB;

            // Keep moving until both pointers meet
            while (pA != pB) {

                // If pA reaches the end, start from headB
                // Otherwise move to the next node
                if (pA == null) {
                    pA = headB;
                } else {
                    pA = pA.next;
                }

                // If pB reaches the end, start from headA
                // Otherwise move to the next node
                if (pB == null) {
                    pB = headA;
                } else {
                    pB = pB.next;
                }
            }

            // Either intersection node or null
            return pA;
        }
    }

    //more Optimal or shorter form-----------

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
}

void main() {
}
