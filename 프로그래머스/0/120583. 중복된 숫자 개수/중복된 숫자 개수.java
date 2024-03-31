import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = 0;
        
        Arrays.sort(array);
        max = array[array.length-1];
        
        int[] count = new int[max+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
            answer = count[n];
        }
        return answer;
    }
}