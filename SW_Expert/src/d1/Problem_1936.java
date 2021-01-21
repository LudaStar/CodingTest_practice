package d1;

import java.util.Scanner;

public class Problem_1936 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a == b+1 || a == b-2) System.out.println("A");
		else System.out.println("B");

		scanner.close();
	}

}
