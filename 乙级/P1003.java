package 乙级;

/*
 * 输入示例
8	
PAT				YES
PAAT			YES
AAPATAA			YES
AAPAATAAAA		YES
xPATx			NO
PT				NO
Whatever		NO
APAAATAA		NO
 */

import java.util.Scanner;

public class P1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flag = true;
        String str;
        char[] chars;
        char tempChar;
        str = in.nextLine();
        for(int i=0; i<n; i++) {
        	
        	int p = 0;
            int left_a = 0, middle_a = 0, right_a = 0;
            int t = 0;
            int position=0; //0:a=lefg, 1:a=middle, 2:a=right
 
        	str = in.nextLine();
        //	System.out.println(str+i);
        	chars = str.toCharArray();
        	flag = true;
        	
        	for(int j=0; j<str.length(); j++) {
        		tempChar = chars[j];
        		switch(tempChar) {
        		case 'P':
        			p++;
        			position = 1;
        			break;
        		case 'A':
        			switch(position) {
        			case 0:
        				left_a++;
        				break;
        			case 1:
        				middle_a++;
        				break;
        			case 2:
        				right_a++;
        				break;
        			}
        			break;
        		case 'T':
        			t++;
        			position = 2;
        			break;
        		default:
        			flag = false;
        		}
        	}
        	if((p==1)&&(t==1)) {
        		switch(middle_a) {
        		case 0:
        			flag = false;
        			break;
        		case 1:
        			if(left_a != right_a)
        				flag = false;
        			break;
        		default:
        			if((left_a * middle_a) != right_a) {
        				flag = false;
        			}
        		}
        	}
        	else {
        		flag = false;
        	}
        	
        	if(flag == true) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        }
	}

}



/*
 * 
8
PAT
PAAT
AAPATAA
AAPAATAAAA
xPATx
PT
Whatever
APAAATAA
 */




















