class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode res_end,res_start;
        if(head1==null) return head2;
        if(head2==null) return head1;
        res_start=res_end=null;
        ListNode tptr1=head1;
        ListNode tptr2=head2;
        ListNode safe;
        while(tptr1!=null &&tptr2!=null)
        {
            if(tptr1.val < tptr2.val)
            {
                safe=tptr1.next;
                tptr1.next=null;
                if(res_start==null)
                    res_start=res_end=tptr1;
                else
                {
                    res_end.next=tptr1;
                    res_end=tptr1;
                }
                tptr1=safe;
            }
            else
            {
                safe=tptr2.next;
                tptr2.next=null;
                if(res_start==null)
                    res_start=res_end=tptr2;
                else
                {
                    res_end.next=tptr2;
                    res_end=tptr2;
                }
                tptr2=safe;    
            }
        }

        if(tptr1!=null)
            res_end.next=tptr1;
        else if(tptr2!=null)
            res_end.next=tptr2;
        return res_start;
    }
}