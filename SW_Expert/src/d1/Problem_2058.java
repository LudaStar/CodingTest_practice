package d1;

import java.util.*;
public class Problem_2058 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		if(1 <= N && N < 10) {
			sum = N;
			
		}
		else if(10 <= N && N < 100) {
			sum = N/10 + N%10;
		}
		else if(N >= 100 && N < 1000) {
			sum = N/100 + (N%100)/10 + (N%100)%10;
			
		}
		else if(N >= 1000 && N < 10000) {
			sum = N/1000 + (N%1000)/100 + ((N%1000)%100)/10 + ((N%1000)%100)%10 ;
		}
		System.out.println(sum);
		sc.close();
	}
}
