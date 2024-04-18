class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = chicken;
        int addchick = 0;
        
        while(true){
           if(coupon<10){
                break;
            }
            addchick += coupon/10;
            coupon = (coupon/10)+(coupon%10);
        }
        answer = addchick;
        return answer;
    }
}