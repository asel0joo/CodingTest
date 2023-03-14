import java.util.*;

class Solution {
    public int solution(String s) {

        String[] words = s.split(" ");

        Set<String> num = new HashSet<>(Arrays.asList(words));
        int wordCnt = num.size();

        return wordCnt;

    }
}
