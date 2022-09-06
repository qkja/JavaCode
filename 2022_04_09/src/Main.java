import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int[] sumHelp = new int[n];
		for(int i=0;i<n;i++) {
			int ret = scan.nextInt();
			arr[i] = ret;
			sum += arr[i];
			sumHelp[i] = sum;
		}
		int total = 0;
		for(int i=0;i<n;i++) {
			total += arr[i] * (sum - sumHelp[i]);
		}
		System.out.println(total);
		
	}
}
