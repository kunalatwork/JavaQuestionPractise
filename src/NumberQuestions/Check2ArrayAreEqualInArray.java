package NumberQuestions;

public class Check2ArrayAreEqualInArray {

	public static void main(String[] args) {
		
		// Match number in two array
		int array[] = {2,3,43,54,5,4,6,5,9,7};
		int array1[] = {12,23,43,64,5,84,96,25,39,47};
	
		int len= array.length;
		int len1= array1.length;
		
		int temp=0;
		int temp1=0;
		
		for(int i=0; i<=len; i++) {
			temp=array[i];
		
		for(int a=0; a<=len1; a++) 
			temp1=array1[i];
		
		
			if(temp==temp1) {
				System.out.println("Array are matching "+temp);
			
		}
			}
		
		// Match number in array
		
		int array2[] = {2,3,43,54,5,4,6,5,9,7};
		
	
		int len2= array2.length;
	
		
		int temp2=0;
		int temp3=0;
		
		for(int i=0; i<=len2; i++) {
			temp2=array2[i];
		
		for(int a=0; a<=len1; a++) 
			temp3=array2[i];
		
		
			if(temp2==temp3) {
				System.out.println("Array are matching "+temp2);
			
		}
			}
		
		
	}

}
