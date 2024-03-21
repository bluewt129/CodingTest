import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cs = 0;
		int sum = 0;
		for(int i=1;i<=t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = a + b;
			cs++;
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+sum);
		} 
	}
}