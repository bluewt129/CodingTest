import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int a=0;a<arr.length;a++) {
			arr[a]=a+1;
		}
		
		for(int a=0;a<m;a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			
			for(int b=i;b<=j;b++) {
				int nn = j--;
			
				int tmp;
				tmp = arr[b];
				arr[b] = arr [nn];
				arr[nn] = tmp;
			}
		}
		for(int b:arr) {
			System.out.print(b+" ");
		}
	}
}