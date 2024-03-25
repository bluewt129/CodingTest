class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        for(int i=1;i<=100;i++){
            answer = num1%num2;
        }
        return answer;
    }
}