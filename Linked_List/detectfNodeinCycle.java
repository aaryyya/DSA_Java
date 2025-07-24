public class detectfNodeinCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        int length = 0;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                ListNode temp = s;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != s);
                // return length;
                break;
            }
        }
        if (length == 0) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while (length > 0) {
            second = second.next;
            length--;
        }
        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return first;

    }
}
