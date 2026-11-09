class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
     for(Map.Entry<Integer,Integer> num: map.entrySet())
     {
        pq.offer(num);
        if(pq.size()>k)
        {
            pq.poll();
        }
     }
     int[] result = new int[k];
    int i = k-1;
     while(!pq.isEmpty())
     {
        result[i] = pq.poll().getKey();
        i--;
     }
     return result;
    }
}
