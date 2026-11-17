class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // Cast to long to prevent integer overflow

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;      // Store the floor value candidate
                left = mid + 1; // Search the right half for a closer value
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return ans;
    }
}