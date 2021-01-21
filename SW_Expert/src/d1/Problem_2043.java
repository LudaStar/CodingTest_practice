package d1;

import java.util.Scanner;

public class Problem_2043 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int P = scanner.nextInt();
		int K = scanner.nextInt();
		
		System.out.println(P-K+1);

		scanner.close();
	}

}
