import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		boolean bl;
		int count = 0;
		
		for(int i=0;i<10;i++) {
			int a = sc.nextInt();
			arr[i] = a%42;
		}
		for(int i=0;i<10;i++) {
			bl = false;
			for(int j=i+1;j<10;j++) {
				if(arr[i] == arr[j]) {
					bl = true;
					break;
				}
			}
			if(bl==false) {
				count++;
			}
		}
		System.out.println(count);
	}
}