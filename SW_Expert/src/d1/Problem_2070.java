package d1;

import java.util.*;

public class Problem_2070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 > num2) System.out.println("#" + test_case + " " + ">");
			else if(num2 > num1) System.out.println("#" + test_case + " " + "<");
			else System.out.println("#" + test_case + " " + "=");


		}
		
		
		sc.close();

	}

}
