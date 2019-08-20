package 乙级;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int a1=0, a2=0, a3=0, a4=0, a5=0;
		boolean b1 = false, b2 = false, b3 = false, b4 = false, b5 = false;
		int a2flag = 1;
		int a4count = 0;
		int p,q;
		DecimalFormat df =new DecimalFormat("#0.0");
		for(int i=0; i<n; i++) {
			p = inScanner.nextInt();
			q = p % 5;
			switch (q) {
			case 0:
				
				if(p%2 == 0) {
					b1 = true;
					a1 += p;
				}
				break;
			case 1:
				b2 = true;
				a2 = a2 + (p*a2flag);
				a2flag = - a2flag;
				break;
			case 2:
				b3 = true;
				a3++;
				break;
			case 3:
				b4 = true;
				a4 += p;
				a4count++;
				break;
			case 4:
				b5 = true;
				if(p > a5) {
					a5 = p;
				}
				break;
			default:
				break;
			}
		}
		char N = 'N';
		
		if(!b1) {
			System.out.print(N +" ");
		}
		else {
			System.out.print(a1+" ");
		}
		
		if(!b2) {
			System.out.print(N+" ");
		}
		else {
			System.out.print(a2+" ");
		}
		if(!b3) {
			System.out.print(N+" ");
		}
		else {
			System.out.print(a3+" ");
		}
		if(!b4) {
			System.out.print(N+" ");
		}
		else {
			System.out.printf;
			double da4 = a4/(1.0)/a4count;
			String sa4 = df.format(da4);
			System.out.print(sa4+" ");
		}
		if(!b5) {
			System.out.print(N);
		}
		else {
			System.out.print(a5);
		}
		

	}

}
