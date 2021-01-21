package d1;

import java.util.Scanner;

public class Problem_2025 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		scanner.close();
	}

}
