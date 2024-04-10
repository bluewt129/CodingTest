class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] arr = String.valueOf(num).split("");
        for(String a : arr) {
        	System.out.print(a);
        }
        for(int i=0;i<arr.length;i++){
        	int a = Integer.parseInt(arr[i]);
            if(a == k) {
            	answer = i+1;
            	break;
            };
        }
        return answer;
    }
}