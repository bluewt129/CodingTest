class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder a = new StringBuilder();
        while(age>0) { 
        	int num = age%10; 
        	a.append((char)('a'+num)); 
        	age /= 10; 
        }
        a.reverse(); 
        answer = a.toString(); 
        return answer; 
    }
}