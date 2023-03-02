class Solution {
    public String solution(String s) {

        int result = Integer.parseInt(s, 16);
        String result2 = Integer.toString(result, 2);

        return result2;
    }
}
