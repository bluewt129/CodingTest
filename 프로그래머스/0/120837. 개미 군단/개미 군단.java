class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        answer = hp/general + hp%general/soldier + hp%general%soldier;
        return answer;
    }
}