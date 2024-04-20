class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int start=i;start<=j;start++) {
        	char[] num = Integer.toString(start).toCharArray();
        	for(int a=0;a<num.length;a++) {
        		if(num[a] == k+'0') {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}