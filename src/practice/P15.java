package practice;

import java.util.Arrays;

public class P15 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {6,7};
		int c[] = new int[a.length+b.length];
		System.out.println(c.length);
		int j = 0;
		int k = 0;
		for (int i = 0; i < c.length; i++) {
			
			if (i%2==0) {
				c[i]= a[k++]; 
			}
			else {
				if(j<b.length)
				c[i]= b[j++]; 
				
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
