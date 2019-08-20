package 乙级;

import java.util.Scanner;

public class P1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = 0;
		T = in.nextInt();
		int a,b,c;
		String  outputString = "Case #";
		for(int i=0; i<T; i++) {
			a = in.nextInt()/2;
			b = in.nextInt()/2;
			c = in.nextInt()/2;
			if(a+b > c) {
				System.out.println(outputString+(i+1)+": true");
			}
			else {
				System.out.println(outputString+(i+1)+": false");
			}
		}
	}

}
