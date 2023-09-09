import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Map<Node,Node> map=new HashMap<>();
        Node curr=head;

        //Create deep copy and making map linking with original node
        while(curr!=null){
            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }

        //Now path allocating
        for(Node key:map.keySet()){
            Node node=map.get(key);
            node.next=map.get(key.next);
            node.random=map.get(key.random);
        }
        return map.get(head);        
    }
}