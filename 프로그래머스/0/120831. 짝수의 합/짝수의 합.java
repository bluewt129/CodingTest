class Solution {
    public int solution(int n) {
        int sum = 0;
        int answer = 0;
        int[] a = new int[n];
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				sum += i+1;
			}
		}
        answer = sum;
        return answer;
    }
}