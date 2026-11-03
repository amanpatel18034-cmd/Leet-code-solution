import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            if (k != 0) {
                runningSum %= k;
            }
            
            if (remainderMap.containsKey(runningSum)) {
                if (i - remainderMap.get(runningSum) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(runningSum, i);
            }
        }
        
        return false;
    }
}