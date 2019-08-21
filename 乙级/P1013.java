package 乙级;

import java.util.Scanner;

public class P1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int m = inScanner.nextInt();
		int maxNumber = 1000000; 
		boolean[] nums = new boolean[maxNumber];
		for(int i=0; i<maxNumber; i++) {
			if((i+1)%2 == 0) {
				nums[i] = false;
			}
			else {
				nums[i] = true;
			}
		}
		int count = 1;
		nums[0] = false;	// 1 isn't prime
		nums[1] = true;		// 2 is prime
		for(int i=3; i<=maxNumber; i++) {
			if(nums[i-1]) {
				count ++;
				int j = i*2;
				int k = 2;
				while (j <= maxNumber ) {
					nums[j - 1] = false;
					k++;
					j = i * k;
				}
			}
			if(count >= m)
				break;
		}
		
		count = 0;
		int cnt = 10;
		int i;
		for( i=1; count<m-1; i++) {
			if(nums[i]) {
				count ++;
				if(count>=n) {
					cnt--;
					if(cnt==0) {
						cnt = 10;
						System.out.println((i+1));
					}
					else {
						System.out.print((i+1)+" ");
					}
				}
			}
		}
		for( ; ;i++) {
			if(nums[i]) {
				System.out.print(i+1);
				break;
			}
		}
	}

}
