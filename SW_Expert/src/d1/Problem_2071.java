package d1;

import java.util.*;
public class Problem_2071 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int sum = 0;
			for(int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                sum += num;
            }
			
			//Math.round�� ����� longŸ��
			//sum�� int�̹Ƿ� sum / 10�ϸ� ����� int�� ����
            int mean = (int) Math.round((double)sum / 10);

            System.out.println("#" + test_case + " " + mean);
		}
		
		sc.close();
	}

}
