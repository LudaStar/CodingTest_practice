package d1;

import java.util.Scanner;

public class Problem_2050 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String alpha = scanner.next();
		
		for(int i = 0; i < alpha.length(); i++) {
			//A : 65
			int num = alpha.charAt(i) - 64;
			System.out.print(num + " ");
		}
		scanner.close();

	}

}
