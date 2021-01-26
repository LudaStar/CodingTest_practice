package d2;

import java.util.Scanner;

public class Problem_1859 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[] nums = new int[N];
			
			for(int n = 0; n < N; n++) {
				nums[n] = sc.nextInt();
			}

			long sum = 0;
			int money = 0;
			
			for(int i = N-1; i >= 0; i--) {
				if(money < nums[i]) {
					money = nums[i];
				}
				else {
					sum += money - nums[i];
				}
			}
			
			
			System.out.println("#" + test_case + " " + sum);
		}

		sc.close();
	}

}
