//https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/
public class removeNthFromEnd {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int length=0;
//         if(head.next==null && n==1) return null;
//         ListNode temp=head;
//         while(temp!=null){
//             length++;
//             temp=temp.next;
//         }
//         if(n==length){
//             return head.next;
//         }
//         ListNode curr=head;
//         for(int i=0;i<length-n-1;i++){
//             curr=curr.next;
//         }
//         curr.next=curr.next.next;
        

//         return head;
//     }
// }
}
