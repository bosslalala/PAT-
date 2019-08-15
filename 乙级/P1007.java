package 乙级;

import java.util.Scanner;

public class P1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		boolean[] prime = new boolean[n];
		for(int i=0;i<n;i++) {
			if((i+1)%2==0) {
				prime[i] = false;
			}
			else {
				prime[i] = true;
			}
		}
		prime[0] = false;	//1 isn't prime
		prime[1] = true;	//2 is prime
		for(int i=3;i<n+1;i++) {
			if(prime[i-1]) {
				System.out.print(i+" ");
				int j = i*2;
				int k = 2;
				while(j<n) {
					prime[j-1]=false;
					k++;
					j = i*k;
				}
			}
		}
		System.out.println();
		int count=0;
		int pre = 2;
		int d;
		for(int i=3; i<n+1; i++) {
			if(prime[i-1]) {
				d = i - pre;
				pre = i;
				System.out.print(d+" ");
				if(d==2) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
