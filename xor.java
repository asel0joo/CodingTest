class Solution {
    public int solution(String[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= Integer.parseInt(arr[i], 2);
        }

        return result;
    }
}
