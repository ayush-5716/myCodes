class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode preptr = head;
        ListNode ptr = head.next;
        Stack<Integer> st = new Stack<>();
        while(ptr!=null){
            if(preptr.val == ptr.val && !(st.contains(ptr.val))){
                st.push(preptr.val);
                System.out.println("pushed " + preptr.val);
            }
            preptr = ptr;
            ptr = ptr.next;
        }
        preptr = head;
        ptr = head;
        while(ptr!=null){
            if(st.contains(ptr.val)){
                if(ptr == head){
                    head = head.next;
                    preptr = head;
                    ptr =head;
                }else{
                    preptr.next = ptr.next;
                    ptr = ptr.next;
                }
            }else{
            preptr= ptr;
            ptr = ptr.next;
            }
        }
        return head;
    }
}
