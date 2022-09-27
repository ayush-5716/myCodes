class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ptr = head;
        int length =0;
        while(ptr!=null){
            length++;
            ptr = ptr.next;
        }
        ptr =head;
        //System.out.println("length: " + length);
        //System.out.println("to split " + k + " times");
        ListNode ans[] = new ListNode[k];
        int perpartlength = length/k;
        //System.out.println("perpartlength: " + perpartlength);
        int residue = length - perpartlength*k;
        //System.out.println("residue: " + residue);
        int IndexCounter=0;
        if(length<k){
            ListNode preptr = ptr;
            while(ptr!=null){
                ans[IndexCounter] = ptr;
                preptr = ptr;
                ptr= ptr.next;
                preptr.next=null;
                IndexCounter++;
            }
        }else{
        while(IndexCounter<k){
            ans[IndexCounter] = ptr;
            int perPartCounter = 1;
            while(perPartCounter<perpartlength && ptr!=null){
                ptr = ptr.next;
                perPartCounter++;
            }
            if(ptr==null) break;
            if(residue>0){
                ptr = ptr.next;
                residue--;
            }
            ListNode preptr = ptr;
            ptr = ptr.next;
            preptr.next =null;
            IndexCounter++;
        }
        }
        return ans;
    }
}
