/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;  // 값를 저장하는 필드
 *     ListNode next;  // 다음 노드 주소를 저장하는 필드
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head; // 1 -> 2-> 3 -> 4 -> 5 

        // current가 null 일 때 그만
        while (current != null) {
        // 다음 노드 지정
        ListNode next = current.next;
        // 화살표 돌리기

        current.next = prev;
        // 자리바꾸기
        prev = current;
        // 현재노드를 다음노드로 이동 즉 다음노드가 현재노드가되는것
        current = next;
        }
        return prev; //prev가 새로운 head
    }
}