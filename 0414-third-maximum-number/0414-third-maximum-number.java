class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long x = num;

            if (x == (first != null ? first : Long.MIN_VALUE) ||
                x == (second != null ? second : Long.MIN_VALUE) ||
                x == (third != null ? third : Long.MIN_VALUE)) {
                continue;
            }

            if (first == null || x > first) {
                third = second;
                second = first;
                first = x;
            } else if (second == null || x > second) {
                third = second;
                second = x;
            } else if (third == null || x > third) {
                third = x;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }
}