//https://leetcode.com/problems/palindrome-linked-list/solutions/
public class palindromicLinkedList {
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
//     public boolean isPalindrome(ListNode head) {
//         ListNode temp=head;
//         int num=0;
//         int n=0;
//         int m=1;
//         if(temp==null){
//             return true;
//         }
//         while(temp!=null){
//             num=num*10+temp.val;
//             n=n+temp.val*m;
//             m*=10;
//             temp=temp.next;
//         }
        
//         return num==n;
        
//     }
// }
}
