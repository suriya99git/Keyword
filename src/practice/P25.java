package practice;

public class P25 {

	public static void main(String[] args) {
		
		int[]arr = {1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0};
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i] ==1 && arr[i]==arr[j]) {
					
					count++;
				}
				else {
					break;
				}
		}

			
			if (count>temp) {
				
				temp = count;
				
			}
		
		}
		
		System.out.println("Maximum consecutive ones : "+temp);
	}
}
