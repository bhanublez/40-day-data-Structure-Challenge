import java.util.ArrayList;
import java.util.List;

public class splitListToparts {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode node = head;
        List<ListNode> result = new ArrayList<>();
        int n = 0;
        while (node != null) {
            n++;
            node = node.next;
        }

        int partition = n / k;
        int rem = n % k;

        node = head;
        for (int i = 0; i < k; i++) {
            result.add(node);
            int partSize = partition + (rem-- > 0 ? 1 : 0);

            for (int j = 0; j < partSize - 1; j++) {
                if (node != null) {
                    node = node.next;
                }
            }

            if (node != null) {
                ListNode temp = node;
                node = node.next;
                temp.next = null;
            }
        }

        return result.toArray(new ListNode[0]);
    }
}
