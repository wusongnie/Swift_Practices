/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode curr = new ListNode(0);
        curr = head;
        List<ListNode> l = new ArrayList<ListNode>();
        while(curr != null){
            if (!l.contains(curr)){
                l.add(curr);
            }
            else{
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
}
