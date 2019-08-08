package 乙级;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = 0; 
		int number;
		int temp;
		
 		n = in.nextInt();
 		int[] nums = new int[n];
 		int[] vital = new int[n];
 		int j = 0;
		HashMap<Integer, Integer> hashMap = new  HashMap<>();
		while(n>0) {
			n--;
			number = in.nextInt();
			nums[j] = number;
			j++;
			//System.out.println(number);
			if(!hashMap.containsKey(number)) {
				temp = number;
				while(temp != 1) {
					if(temp % 2 != 0) {
						temp = temp * 3 + 1;
					}
					temp /= 2;
					hashMap.put(temp, number );
				}
			}
			
		}
		boolean flag = false;
		//System.out.print(nums);
		int p=0;
		for(int i=0; i<nums.length; i++) {
			if(!hashMap.containsKey(nums[i])) {
				vital[p] = nums[i];
				p++;
			}
		}
		
		Arrays.sort(vital);
		while(p>0) {
			if(flag) {
				System.out.print(" ");
			}
			System.out.print(vital[j-1]);
			flag = true;
			j--;
			p--;
		}
		
	}

}
