import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int time = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='C') {
				time += (2+1);
			}else if(s.charAt(i)>='D' && s.charAt(i)<='F') {
				time += (2+2);
			}else if(s.charAt(i)>='G' && s.charAt(i)<='I') {
				time += (2+3);
			}else if(s.charAt(i)>='J' && s.charAt(i)<='L') {
				time += (2+4);
			}else if(s.charAt(i)>='M' && s.charAt(i)<='O') {
				time += (2+5);
			}else if(s.charAt(i)>='P' && s.charAt(i)<='S') {
				time += (2+6);
			}else if(s.charAt(i)>='T' && s.charAt(i)<='V') {
				time += (2+7);
			}else if(s.charAt(i)>='W' && s.charAt(i)<='Z') {
				time += (2+8);
			}
		}
		System.out.println(time);
	}
}