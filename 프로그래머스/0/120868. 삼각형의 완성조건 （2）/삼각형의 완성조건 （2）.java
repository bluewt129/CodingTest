import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int min = sides[0];
        int max = sides[1];
        
        int maxrange = sides[0]+sides[1];
        int minrange = sides[1]-sides[0];
        
        answer = maxrange-minrange-1;
        return answer;
    }
}