class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        // Slide a window of size 10 across the string
        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            
            // If seen.add() returns false, the substring already exists in 'seen'
            if (!seen.add(substring)) {
                repeated.add(substring);
            }
        }

        return new ArrayList<>(repeated);
    }
}