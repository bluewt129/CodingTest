class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int da1 = Integer.parseInt(bin1+"", 2);
		int db1 = Integer.parseInt(bin2+"", 2);
		int dsum = da1+db1;
		answer = Integer.toBinaryString(dsum);
        return answer;
    }
}