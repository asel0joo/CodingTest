import java.util.Arrays;

//2-1-1
class Solution {
    public int solution(int[] arr) {

        Arrays.sort(arr);

        int maxCircle = 0;
        for (int i = arr.length - 1; i >= 3; i--) {
            int a = arr[i];
            int b = arr[i - 1];
            int c = arr[i - 2];
            if (a < b + c) {
                maxCircle = a + b + c;
                break;
            }
        }

        return maxCircle;
    }
}
