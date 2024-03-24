import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = 0, j = 0, k = 0;
		int[] arr = new int[n];
		for(int a=0;a<m;a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for(int b=i-1;b<j;b++) {
				arr[b] = k;
			}
		}
		for(int b: arr) {
			System.out.print(b+" ");
		}
	}
}