package d1;

import java.util.*;
public class Problem_2056 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String num = sc.next();

			String year = num.substring(0,4);
			String month = num.substring(4,6);
			String day = num.substring(6);
			boolean check = false;
			
			int month_int = Integer.parseInt(month);
			int day_int = Integer.parseInt(day);

			switch(month_int) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				if(day_int >= 1 && day_int <= 31) {
					check = true;					
				}
				break;

			case 2 :
				if(day_int >= 1 && day_int <= 28) {
					check = true;
				}
				break;

			case 4 :
			case 6 :
			case 9 :
			case 11 :
				if(day_int >= 1 && day_int <= 30) {
					check = true;
				}
				break;
					

			}
			if(check) System.out.println("#"+test_case+ " " + year+"/"+month+"/"+day);
			else System.out.println("#"+test_case+ " " + "-1");


		}
		sc.close();

	}

}
