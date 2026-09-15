class Solution {
    public int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            if (current < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(current, max * current);
            min = Math.min(current, min * current);

            answer = Math.max(answer, max);
        }

        return answer;
    }
}