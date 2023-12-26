package javaIQ;

public class DuplicateArray {
	
	
	public static void main(String args[]) {
		
		int arr[] = new int[] {1,3,3,3,2,2,2,2,5,5};
		
		System.out.println("Duplicate Value");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]&& i!=j)
				{
					System.out.println("Duplicate value is" + arr[j]);
					
				}
				
				
			}
			
		}
		
	}

}
