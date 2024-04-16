class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] strr1 = str1.split("");
        String[] strr2 = str2.split("");
        for(int i=0;i<str1.length();i++){
            answer += strr1[i]+strr2[i];
        }
        return answer;
    }
}