class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int[] boxd = new int[3];
        boxd[0] = box[0]/n;
        boxd[1] = box[1]/n;
        boxd[2] = box[2]/n;
        answer = boxd[0] * boxd[1] * boxd[2];
        return answer;
    }
}