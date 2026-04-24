class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hash = new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hash);
       PriorityQueue<Map.Entry<Integer,Integer>> minheap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> min: hash.entrySet())
        {
            minheap.offer(min);
              if(minheap.size()>k)
        {
            minheap.poll();
        }
        }
      
        int[] result = new int[k];
        int i =k-1;
       while(!minheap.isEmpty())
       {
        result[i--] = minheap.poll().getKey();
       }
           return result;    
    }
}
