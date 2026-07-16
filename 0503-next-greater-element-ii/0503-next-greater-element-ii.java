class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<String> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && Integer.parseInt(st.peek()) <= nums[i % n])
                st.pop();

            if (i < n)
                ans[i] = st.isEmpty() ? -1 : Integer.parseInt(st.peek());

            st.push(String.valueOf(nums[i % n]));
        }

        return ans;
    }
}