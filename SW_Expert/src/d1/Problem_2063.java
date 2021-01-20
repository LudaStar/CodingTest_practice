package d1;

import java.util.*;
public class Problem_2063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int T;
		//T=sc.nextInt();
		
		//for(int test_case = 1; test_case <= T; test_case++)
		//{
			int N = sc.nextInt();

			int[] array = new int[N];
			
			for(int i = 0; i < N; i++) {
				array[i] = sc.nextInt();
			}

			Arrays.sort(array);
			
			System.out.println(array[N/2]);

		//}
		
		sc.close();
	}

}
