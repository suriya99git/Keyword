package practice;

public class P26 {

	public static void main(String[] args) {
		
		int num = 5;
		System.out.println(recurssion(num));
		
	}
	
	public static int recurssion(int a) {
		if (a==0||a==1) 
			return 1;
		else
			return a*recurssion(a-1);
		
		
	}
}
