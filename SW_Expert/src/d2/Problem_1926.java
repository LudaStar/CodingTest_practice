package d2;

import java.util.Scanner;

public class Problem_1926 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			String tmp = String.valueOf(i);
			if(tmp.contains("3") || tmp.contains("6") || tmp.contains("9"))
			{
				for(int j = 0; j < tmp.length(); j++) {
					if(tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9') 
						System.out.print("-");
				}
				System.out.print(" ");
				
			}
			else {
				System.out.print(i+" ");
			}
				
		}
		
		sc.close();
	}

}
