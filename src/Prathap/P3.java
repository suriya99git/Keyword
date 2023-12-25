package Prathap;

public class P3 {
	public static void main(String[] args) {
		String s="software";
		String s2="";
		String s3="";
		for(int i=s.length()-3;i>=2;i--)
		{
			s2+=s.charAt(i);
		}
		s3+=s.substring(0,2)+s2+s.substring(s.length()-2,s.length());
		System.out.println(s3);
		}
	}


