package 乙级;

import java.util.Scanner;

public class P1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = 0;
		p = n/100;
		n = n%100;
		while(p>0) {
			System.out.print("B");
			p--;
		}
		p = n/10;
		n = n%10;
		while(p>0) {
			System.out.print("S");
			p--;
		}
		int i = 1;
		while(n>0) {
			System.out.print(i);
			i++;
			n--;
		}
	}

}
