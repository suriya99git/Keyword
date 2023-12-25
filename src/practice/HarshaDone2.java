package practice;

public class HarshaDone2 {
	public static void main(String[] args) {
		String string="ELF44AND45JAVASELENIUM2023";
		System.out.println(extractAndAdd(string));
	}
	
	public static int extractAndAdd(String s) {
		int num = 0;
		String s1 = "";
		boolean flag = false;
		 char[] ch = s.toCharArray();
		 
		 for (int i = 0; i < ch.length; i++) {
			
			 if (ch[i]>='0'&& ch[i]<='9') {
				
				 flag = true;
				 s1+=ch[i];
			}
			 else if (flag) {
				 num = Integer.parseInt(s1);
				flag = false;
				s1+="";
			}
			 
		}
		 if(flag) {
				num+=Integer.parseInt(s1);
			}
		 return num;
	}
//	public static int extractAndAdd(String string) {
//		int sum=0;
//		String temp="";
//		boolean flag=false;
//		char[] ch=string.toCharArray();
//		for (char c : ch) {
//			if (c>='0'&&c<='9') {
//				flag=true;
//				temp+=c;
//			}
//			else if(flag) {
//				sum+=Integer.parseInt(temp);
//				flag=false;
//				temp="";
//			}
//		}
//		if(flag) {
//			sum+=Integer.parseInt(temp);
//		}
//		return sum;
//	}
}
