class Node{
	int data;
	int key;
	Node next;
	Node prev;

	Node(int key, int data)
{
	this.data = data;
	this.key = key;

}
}

class LRUCache {

Map<Integer,Node> hash = null;
int capacity=0;
Node head ;
Node tail;


    public LRUCache(int capacity) {
        this.capacity=capacity;
		hash = new HashMap();
		head = new Node(0,0);
		tail = new Node(0,0);
		head.next = tail;
		tail.prev = head;
    }
    
    public int get(int key) {
       if(!hash.containsKey(key)){
		return -1;
	   }
	   Node node = hash.get(key);
	   removeNode(node);
	   insertNode(node);
	   return node.data;
    }
    
    public void put(int key, int value) {
      if(hash.containsKey(key))  
	  {
		Node node = hash.get(key);
		node.data = value;
		 removeNode(node);
		   insertNode(node);
	  }else{
		if(hash.size()==capacity)
		{
			Node lru = tail.prev;
			removeNode(lru);
			hash.remove(lru.key);
			
		}
		Node newNode = new Node(key,value);
		insertNode(newNode);
		hash.put(key,newNode);
	  }
    }

public void removeNode(Node node)
{
node.prev.next = node.next;
node.next.prev = node.prev;
}

public void insertNode(Node node)
{
	Node nextNode = head.next;

	head.next = node;
	node.prev  = head;

	node.next = nextNode;
	nextNode.prev = node;
	
}
}
