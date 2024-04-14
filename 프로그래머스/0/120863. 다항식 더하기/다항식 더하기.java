class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" ");
		int x = 0;
		int num = 0;
		for(int i=0;i<str.length;i++) {
			if(str[i].contains("x")) {
				if(str[i].length()==1) {
					x++;
				}else {
					x += Integer.parseInt(str[i].replaceAll("x", ""));
				}
			}else if(!str[i].contains("+")){
				num += Integer.parseInt(str[i]);
			}
		}
        if(x==1 && num != 0) {
			answer = "x + "+num;
		} else if(x==1 && num == 0) {
			answer = "x";
		} else if(x!=0 && num!=0) {
			answer = x + "x + " + num;
		}else if(x!=0 && num==0) {
			answer = x +"x";
		}else if(x==0 && num!=0) {
			answer = num+"";
		}else {
			answer = 0+"";
		}
        return answer;
	}
}