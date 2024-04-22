class Solution{
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		double[] sum = new double[score.length];
		int[] cnt = new int[sum.length];
		for(int i=0;i<score.length;i++) {
			sum[i] = (double)(score[i][0]+score[i][1])/2;
		}
		for(int i=0;i<score.length;i++) {
			int order = 1;
			for(int j=0;j<score.length;j++) {
				if(sum[i]<sum[j]) {
					order++;
				}
			}
			answer[i] = order;
		}
		
		return answer;
	}
}