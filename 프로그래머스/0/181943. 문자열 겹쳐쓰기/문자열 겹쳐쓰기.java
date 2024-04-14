class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.replaceAll(my_string.substring(s),"") + overwrite_string + my_string.substring(s+overwrite_string.length());
        return answer;
    }
}