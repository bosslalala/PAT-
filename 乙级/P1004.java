package 乙级;

import java.util.Scanner;

public class P1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = 0;	//student's number
		String[] names = new String[2];
		String[] stu_id = new String[2];
		String[] temp = new String[2];
		String newline;
		int best = 0;
		int last = 100;
		
		n = in.nextInt();
		newline = in.nextLine();
		while(n>0) {
			n--;
			newline = in.nextLine();
		//	System.out.println(newline+" "+ n);
			temp = newline.split(" ");
			if(Integer.parseInt(temp[2])>best) {
				best = Integer.parseInt(temp[2]);
				names[0] = temp[0];
				stu_id[0] = temp[1];
			}
			if(Integer.parseInt(temp[2])<last) {
				last = Integer.parseInt(temp[2]);
				names[1] = temp[0];
				stu_id[1] = temp[1];
			}
			
		}
		
		System.out.println(names[0]+" "+stu_id[0]);
		System.out.println(names[1]+" "+stu_id[1]);
	}

}
