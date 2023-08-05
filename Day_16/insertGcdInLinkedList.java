//https://leetcode.com/contest/biweekly-contest-110/problems/insert-greatest-common-divisors-in-linked-list/
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
public class insertGcdInLinkedList {
//     class Solution {
//         public int gcd(int x, int y ){
//            while (y != 0) {
//                int temp = y;
//                y = x % y;
//                x = temp;
//            }
//            return x;
//        }
//        public ListNode insertGreatestCommonDivisors(ListNode head) {
//            if (head == null || head.next == null) {
//                return head;
//            }
   
//            ListNode curr = head;
//            while (curr.next != null) {
//                int value = gcd(curr.val, curr.next.val);
//                ListNode newNode = new ListNode(value);
//                newNode.next = curr.next;
//                curr.next = newNode;
//                curr = curr.next.next;
//            }
   
//            return head;
//        }
//    }
}
