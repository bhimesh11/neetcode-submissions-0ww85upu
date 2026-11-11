class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int left = 0;
        int right = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for ( right = 0; right < nums.length; right++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[right]) {
                dq.pollLast();
            }
            dq.offerLast(right);

            if (dq.peekFirst() < left) {
                dq.pollFirst();
            }
            if (right - left + 1 == k) {
                ans[left] = nums[dq.peekFirst()];
                left++;
            }
        }
        return ans;
    }
}
