import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        int k = 0;
        int[] answer = new int[cnt];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer[k] = i;
                k++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}