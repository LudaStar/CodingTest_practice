package d1;

import java.util.Scanner;

public class Problem_2019 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int mul = 1;
		
		System.out.print(mul + " ");
		for(int i = 0; i < num; i++) {
			mul *= 2;
			System.out.print(mul + " ");
		}
		scanner.close();
	}

}
