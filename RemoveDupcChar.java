class Solution {
    public String solution(String s) {

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==s.charAt(i+1) ){
              s.remove(i);
              s.remove(i+1);
                
            }
        }

        return s;
    }
}
