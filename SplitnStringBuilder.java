class Solution {
    public String[] solution(String s) {

        // 1. 구분자 기준으로 단어 구분
        String[] answer = s.replaceAll("\\s", "").split("[.,!? ]");

        // 2. 문자열 뒤집기
        for (int i = 0; i < answer.length; i++) {
            StringBuilder sb = new StringBuilder(answer[i]);
            answer[i] = sb.reverse().toString();
        }

        return answer;
    }
}
