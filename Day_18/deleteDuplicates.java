//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
public class deleteDuplicates {
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
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head==null ||head.next==null) return head;

//         ListNode temp_head=new ListNode(0);
//         temp_head.next=head;
//         ListNode curr=temp_head;
//         while(curr.next!=null && curr.next.next!=null){
//             if(curr.next.val==curr.next.next.val){
//                 int dupli=curr.next.val;
//                 while(curr.next!=null && curr.next.val==dupli){
//                     curr.next=curr.next.next;
//                 }
//             }else{
//                 curr=curr.next;
//             }
//         }

//         return temp_head.next;
//         }
// }
}
