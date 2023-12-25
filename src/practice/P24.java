package practice;

import java.util.Iterator;

public class P24 {

	public static void main(String[] args) {
		
		String fres = "";
		String s = "ELF44ANDAND45JAVASELENEIUM2023";
		
		char[] s1 = s.toCharArray();
		
		String res = " ";
		char last = s.charAt(s.length()-1);
		for (int i = 0; i < s1.length-1; i++) {
			
			if (s1[i]>='0' && s1[i]<='9') {
				
				res+=s1[i]+"";
				
			}
			else  {
				res+= " ";
				
			}
			
			
		}
		
		String result = res+""+last;
		
		result = result.trim();
		
		System.out.println(result);
		
//		 char[] remove = result.toCharArray();
//		 
//		 
//		 for (int i = 0; i < remove.length; i++) {
//			 String store = "";
//			 if (remove[i]>='0' && remove[i]<='9') {
//				
//				 store = remove[i]+"";
//			}
//			 else {
//				 
//				continue;
//			}
//			 fres+=store;
//		}
//		 System.out.println(fres);
	}
}
