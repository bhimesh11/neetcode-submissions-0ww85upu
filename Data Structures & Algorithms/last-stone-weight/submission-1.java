class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
       for(int x : stones)
       {
        maxheap.add(x);
       }
       while(maxheap.size()>1)
       {
        int x = maxheap.poll();
        int y = maxheap.poll();
        if(y!=x)
        {
            maxheap.add(x-y);
        }
       }
       return  maxheap.isEmpty()?0:maxheap.peek();
    }
}
