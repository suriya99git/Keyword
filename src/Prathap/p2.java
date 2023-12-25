package Prathap;

import java.util.Arrays;

public class p2 {

	public static void main(String[] args) {

		String str="my name is usman";
		char ch[]=str.toCharArray();
		int count=0; int index1=0;
		for(int i=0;i<str.length();i++)
		{

			if(i==0||(ch[i]==' '&&ch[i+1]!=' '))
			{
				count++;
				if(count%2!=0) {
					if(i==0)
						index1=i;
					else {
						index1=i+1;
					}                
				}
				else {
					int index2=i+1;
					ch[index1]=ch[index2];
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}

