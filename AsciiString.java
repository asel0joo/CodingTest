class Solution {
    public String solution(int[] arr) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i ++){
            char c = (char)arr[i];
            sb.append(c);
        }

        String result = sb.toString();
        return result;
    }
}
