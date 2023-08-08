//https://leetcode.com/problems/reverse-linked-list-ii/
public class reverseBetweem {
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
//     public ListNode reverseLinkedList(ListNode head){
//         // p stands for pointer pointing to the ListNode Node
//         ListNode prev=null;
//         ListNode curr=head;
//         ListNode forward=curr.next;
//         while(forward!=null){
//             curr.next=prev;
//             prev=curr;
//             curr=forward;
//             forward=forward.next;
//         }
//         curr.next=prev;
//         return curr;
//     }
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         if(head.next==null || left==right)
//          return head;

//         ListNode myNode=new ListNode(0);
//         myNode.next=head;
//         ListNode prev=myNode;
//         for(int i=0;i<left-1;i++){
//              prev=prev.next;
//         }
//         ListNode curr=prev.next;
//         for(;left<right;left++) curr=curr.next;
//         ListNode forward=curr.next;
//         curr.next=null;
//         for(prev.next=reverseLinkedList(prev.next);
//         prev.next!=null;
//         prev=prev.next);
//         prev.next=forward;
//         return myNode.next;
//     }
// }    
}
