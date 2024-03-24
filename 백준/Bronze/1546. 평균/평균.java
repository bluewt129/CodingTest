import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		int max = 0;
		double newscore = 0;
		double sum =0;
		double tmp = 0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[max]<arr[i]) {
				max = i;
			}
		}
		tmp = arr[max];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (double)(arr[i]/tmp*100);
			sum += arr[i];
		}
		System.out.println(sum/n);
	}
		
}