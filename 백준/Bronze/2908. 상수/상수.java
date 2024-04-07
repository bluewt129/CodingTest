import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%10>b%10 || (a%10==b%10 && a%100>b%100) || (a%10==b%10 && a%100==b%100 && a%1000>b%1000)) {
			String a1 = a+"";
			StringBuilder sb = new StringBuilder(a1);
			System.out.println(sb.reverse());
			}else{
			String b1 = b+"";
			StringBuilder sb2 = new StringBuilder(b1);
			System.out.println(sb2.reverse());
		}
	}
}