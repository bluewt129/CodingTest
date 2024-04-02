class Solution {
    public String solution(String letter) {
        String answer = "";
        //morseList 배열에 모스부호를 순서대로 넣어줌
        String[] morseList = {".-", "-...", "-.-.", "-..", ".", "..-.", 
                               "--.", "....", "..", ".---", "-.-", ".-..", 
                               "--", "-.", "---", ".--.", "--.-", ".-.", 
                               "...", "-", "..-", "...-", ".--", "-..-", 
                               "-.--", "--.."}; 
        String[] morse;
        
        morse = letter.split(" "); 
        for(String s : morse) {
            for(int i = 0; i < morseList.length; i++) {
                if(s.equals(morseList[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer; 
    }
}