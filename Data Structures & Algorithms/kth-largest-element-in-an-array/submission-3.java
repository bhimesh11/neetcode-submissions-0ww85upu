class Solution {
    public int findKthLargest(int[] nums, int k) {

        if(nums.length==1)
        {
            return 1;
        }

        int target = nums.length - k;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int pivot = findPivot(nums, low, high);
            if (pivot == target) {
                return nums[pivot];
            } else if (pivot < target) {
                low = pivot + 1;
            } else {
                high = pivot-1;
            }
        }
        return -1;
    }

    public int findPivot(int[] nums, int low, int high) {
        int pivot = nums[high];
        int start = low;

        for (int i = low; i < nums.length; i++) {
            if (nums[i] < pivot) {
                swap(nums, start, i);
                start++;
            }
        }
        swap(nums, start, high);
        return start;
    }

    public void swap(int[] nums, int start, int high) {
        int temp = nums[start];
        nums[start] = nums[high];
        nums[high] = temp;
    }
}

       // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // for(int i : nums)
        // {
        //     pq.add(i);

        //     if(pq.size()>k)
        //     {
        //         pq.poll();
        //     }
        // }
        // return pq.peek();
