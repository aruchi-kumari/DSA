class Solution {
    public int maxLength(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            int gcd = 0;
            int lcm = 1;

            for (int j = i; j < nums.length; j++) {
                prod = prod * nums[j];
                gcd = findGCD(gcd, nums[j]);
                lcm = findLCM(lcm, nums[j]);

                if (prod == gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public int findLCM(int a, int b) {
        return (a / findGCD(a, b)) * b;
    }
}