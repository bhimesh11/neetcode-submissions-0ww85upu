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

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prevNode = null;
        
        while(temp!=null)
        {
            // find the knode
          ListNode  kNode = findKNode(temp,k);
            //if the last iteration
            if(kNode ==null)
            {
                if(prevNode!=null) prevNode.next = temp;
                break;
            }
          ListNode  nextNode = kNode.next;
             kNode.next = null;

           ListNode newHead =  reversetheGroup(temp);
             if(temp==head)
             {
                head = newHead;
             }else{
                prevNode.next = newHead;
             }
             prevNode = temp;
             temp = nextNode;
        }    
        return head;
    }

    public ListNode findKNode(ListNode temp , int k)
    {
       
        while(temp!=null && k>1)
        {
            temp = temp.next;
            k--;
        }
        return temp;
    }


    public ListNode reversetheGroup(ListNode temp)
{
   ListNode prev = null;
   ListNode current = temp;

   while(current!=null)
   {
  ListNode next = current.next;
 current.next = prev;
 prev = current;
    current = next;
   }
return prev;
}
}
