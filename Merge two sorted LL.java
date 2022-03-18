public class Solution
{ 
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2)
    {
    		LinkedListNode<Integer> head=null,tail=null;
		if(head1==null)
        	{
        	    return head2;
        	}
        	if(head2==null)
        	{
	            return head1;
        	}
		while(head1!=null && head2!=null)
        	{	
			if(head1.data<=head2.data)
            		{	
				if(head==null)
                		{
					head=head1;
					tail=head1;
				}
                		else 
                		{
					tail.next=head1;
					tail=head1;
				}
				head1=head1.next;
			}
            		else 
            		{
				if(head==null) 
                		{
					head=head2;
					tail=head2;
				}
                		else
                		{
					tail.next=head2;
					tail=head2;
				}
				head2=head2.next;	
			}
		}
		if(head1==null) 
        	{
			tail.next=head2;
		}
		if(head2==null) 
        	{
			tail.next=head1;
		}
		return head;   
    }
}