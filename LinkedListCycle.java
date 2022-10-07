Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode ptr = head;
        while(ptr!=null){
            if(st.contains(ptr)){
                return ptr;
            }else{
                st.push(ptr);
                ptr = ptr.next;
            }
        }
        return null;
    }
}
