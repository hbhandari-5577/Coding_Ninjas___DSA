// Code : Merge Sort
// Send Feedback
// Sort a given linked list using Merge Sort.
// You don't need to print the elements, just sort the elements and return the head of updated LL.
// Input format :
// Linked list elements (separated by space and terminated by -1)
// Output format :
// Updated LL elements (separated by space)
// Constraints :
// 1 <= Length of LL <= 1000
// Sample Input 1 :
// 1 4 5 2 -1
// Sample Output 1 :
// 1 2 4 5
public class Solution
{
	public static LinkedListNode<Integer> mid(LinkedListNode<Integer>head)
	{
		LinkedListNode<Integer>fast=head.next;
		LinkedListNode<Integer>slow=head;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public static LinkedListNode<Integer> mergeSortedLL(LinkedListNode<Integer>firstHead,LinkedListNode<Integer>secondHead)
    	{
		LinkedListNode<Integer>newHead=null;
		LinkedListNode<Integer>sorting=null;
		if(firstHead==null)
			return secondHead;
		else
			if(secondHead==null)
				return firstHead;
			else
			{
				if(firstHead.data<=secondHead.data)
					{
					sorting=firstHead;
					firstHead=firstHead.next;
					}
				else
				{
					sorting=secondHead;
					secondHead=secondHead.next;
				}
				newHead=sorting;
				while(firstHead!=null&&secondHead!=null)
				{
					if(firstHead.data<=secondHead.data)
					{
							sorting.next=firstHead;
							sorting=firstHead;
							firstHead=firstHead.next;
					}
					else
					{
							sorting.next=secondHead;
							sorting=secondHead;
							secondHead=secondHead.next;
					}
				}
				if(firstHead==null)
				{
						sorting.next=secondHead;
				}
				else if(secondHead==null)
				{
						sorting.next=firstHead;		
				}
				eturn newHead;
			}
	}
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head)
    	{
		if(head==null||head.next==null)
		{
			return head;
		}
		LinkedListNode<Integer>mid=mid(head);
		LinkedListNode<Integer>firstHalfTail=mid;
		LinkedListNode<Integer>secondHalfHead=mid.next;
		firstHalfTail.next=null;
		LinkedListNode<Integer>head1=mergeSort(head);
		LinkedListNode<Integer>head2=mergeSort(secondHalfHead);
		LinkedListNode<Integer>mergedListHead=mergeSortedLL(head1, head2);
		return mergedListHead;
	}

}