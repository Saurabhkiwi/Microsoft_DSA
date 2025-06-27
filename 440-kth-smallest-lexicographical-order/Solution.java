public class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;  // Start from 1
        k = k - 1;     // We already count "1"

        while (k > 0) {
            long steps = countSteps(n, curr, curr + 1);

            if (steps <= k) {
                // Skip this subtree
                curr++;
                k -= steps;
            } else {
                // Go deeper into this subtree
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    // Counts the number of lexicographical steps between prefix and next prefix
    private long countSteps(int n, long curr, long next) {
        long steps = 0;

        while (curr <= n) {
            steps += Math.min(n + 1L, next) - curr;
            curr *= 10;
            next *= 10;
        }

        return steps;
    }
}
