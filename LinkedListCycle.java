import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        Set<ListNode> seenNodes = new HashSet<>();

        ListNode curr = head;

        while (curr != null) {

            if (seenNodes.contains(curr)) {
                return true;
            }

            seenNodes.add(curr);
            curr = curr.next;
        }

        return false;
    }
}
