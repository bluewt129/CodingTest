class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n;i>0;i--){
            if(n==i*i){
                answer = 1;
            }
            if(answer!=1){
                answer = 2;
            }
        }
        return answer;
    }
}