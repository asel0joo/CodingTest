import java.util.Arrays;

//2-1-2
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        double sum = 0;
        for(int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        int avg = (int)(sum / (arr.length - 2));
        return avg;

    }
}
