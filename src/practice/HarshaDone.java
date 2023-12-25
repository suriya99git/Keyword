package practice;

public class HarshaDone {
	public static void main(String[] args) {
		String string="ELF44AND45JAVASELENIUM2023";
		System.out.println(extractAndAdd(string));
	}
	public static int extractAndAdd(String string) {
		int sum=0;
		int temp=0;
		boolean flag=false;
		char[] ch=string.toCharArray();
		for (char c : ch) {
			if (c>='0'&&c<='9') {
				flag=true;
				temp=temp*10+(c-'0');
			}
			else if(flag) {
				sum+=temp;
				flag=false;
				temp=0;
			}
		}
		if(flag) {
			sum+=temp;
		}
		return sum;
	}
}
