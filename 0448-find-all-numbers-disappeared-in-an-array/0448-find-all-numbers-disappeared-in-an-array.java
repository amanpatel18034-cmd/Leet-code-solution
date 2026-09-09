class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // First pass: Mark visited numbers as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Second pass: Find numbers that were not visited (still positive)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}