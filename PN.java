class Solution {
    public boolean solution(int n) {

        boolean isPrimeNum = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrimeNum = false;
                break;
            }
        }

        if (isPrimeNum && n >= 2) {
            return true;
        } else {
            return false;
        }

    }
}
