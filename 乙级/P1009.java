package 乙级;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] words = new char[10];
		int j = 0;
		int p = 0;
		char[] chars = str.toCharArray();
		for(int i=chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
		System.out.println();
		for(int i=chars.length-1; i>=0; i--) {
			if(chars[i]==' ' || i==0) {
				if(i==0)
				{
					p = i;
                    while(p<=(i+j)) {
					    System.out.print(chars[p]);
					    p++;
				    }
                    break;
				}
				else {
					p = i+1;
                    while(p<=(i+j)) {
					    System.out.print(chars[p]);
					    p++;
				    }
                    System.out.print(" ");
				    j = 0;
				}
			}
			else {
				j++;
			}
		}
		
	}

}
