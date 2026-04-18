/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
     //1
     Node temp = head;
     while(temp!=null)
     {
        Node nextNode= temp.next;
       Node copyNode = new Node(temp.val);
       temp.next = copyNode;
       copyNode.next = nextNode;
       temp = nextNode;
     }
     //2
     Node temp2 = head;
     while(temp2!=null)
     {
        
        Node copyNode = temp2.next;
        if(temp2.random!=null)
        {
            copyNode.random = temp2.random.next;
        }else{
            copyNode.random = null;
        }
        temp2 = temp2.next.next;
     }
     //3
     Node dummyNode = new Node(-1);
     Node res = dummyNode;
     Node temp3 = head;
     while(temp3!=null)
     {
        res.next = temp3.next;
        res = res.next;
        temp3.next = temp3.next.next;
        temp3 = temp3.next;
     }
     return dummyNode.next;
    }
}
