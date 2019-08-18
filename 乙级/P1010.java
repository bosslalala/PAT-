package 乙级;

import java.util.Scanner;

public class P1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int p = 0; //系数
		int q = 0; //指数
		
		boolean flag = true;
		while (in.hasNext()) {
			p = in.nextInt();
			q = in.nextInt();
			//System.out.println(p + " " + q);
			if(q!=0) {
				if(flag) {
					System.out.print(p*q+" "+(q-1));
					flag = false;
				}
				else {
					System.out.print(" "+p*q+" "+(q-1));
				}
				
			}
		}
		
		if(flag) {
			System.out.print("0 0");
		}
	}

}
