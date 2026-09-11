class Solution {
    public int maxLength(int[] nums) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            long product = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < nums.length; j++) {
                product *= nums[j];

                gcd = gcd(gcd, nums[j]);

                lcm = (lcm / gcd(lcm, nums[j])) * nums[j];

                if (product == gcd * lcm) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}