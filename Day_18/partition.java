//https://leetcode.com/problems/partition-list/description/
public class partition {
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
//     public ListNode partition(ListNode head, int x) {

//         ListNode left=new ListNode(0);
//         ListNode right=new ListNode(0);

//         ListNode left_t=left;
//         ListNode right_t=right;
//         while(head!=null){
//             if(head.val<x){
//                 left_t.next=head;
//                 left_t=left_t.next;
//             }else{
//                 right_t.next=head;
//                 right_t=right_t.next;
//             }
//             head=head.next;
//         }
//         left_t.next=right.next;
//         right_t.next=null;
//         return left.next;
//     }
// }
}
