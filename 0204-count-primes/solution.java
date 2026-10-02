class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] crossedOut = new boolean[n];
        int prime = 0;

        for (int i = 2; i < n; i++) {
            if (!crossedOut[i]) {
                prime++;

                if ((long) i * i < n) {
                    for (long j = (long) i * i; j < n; j += i) {
                        crossedOut[(int) j] = true;
                    }
                }
            }
        }

        return prime;
    }
}
