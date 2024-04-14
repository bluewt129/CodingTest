import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int fnum = numbers[0]*numbers[1];
        int bnum = numbers[numbers.length-2]*numbers[numbers.length-1];
        if(fnum>bnum){
            answer = fnum;
        }else{
            answer = bnum;
        }
        return answer;
    }
}