package 乙级;

import java.util.Scanner;

public class P1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int step = in.nextInt();
		step = step%n;
		System.out.println(n+" "+step);
		
		int[] numbers = new int[n];
		for(int i=0; i<n; i++) {
			numbers[i] = in.nextInt();
		}
		int p,j,q;  
		boolean[] bstep = new boolean[step];
		for(int i=0; i<step; i++) {
			bstep[i] = true;
		}
		for(int i=0; i<step; i++) {
			
			if(bstep[i]) {
				bstep[i] = false;
				j = i+step;
				p = numbers[i];
				while(j!=i) {
					
					q = numbers[j];
					numbers[j] = p;
					
					System.out.print(p+":"+(j+1)+" ");
					
					p = q;
					j = (j+step)%n;
					if(j<step) {
						bstep[j] = false;
					}
				}
				numbers[i] = p;
			}
			
		}
		System.out.println();
		for(int i=0; i<n-1; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.print(numbers[n-1]);
	}

}
