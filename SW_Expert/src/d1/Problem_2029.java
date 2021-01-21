package d1;

import java.util.Scanner;

public class Problem_2029 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int T;
		T=scanner.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println("#" + test_case + " " + (a/b) + " " + (a%b));
		}
		
		scanner.close();

	}

}
