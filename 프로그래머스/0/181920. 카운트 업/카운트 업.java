class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        System.out.println(answer.length);
        
        for(int i=0;i<answer.length;i++) {
        		answer[i] = start_num;
        		start_num++;
        }
        return answer;
    }
}