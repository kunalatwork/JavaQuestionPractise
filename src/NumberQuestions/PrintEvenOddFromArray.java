package NumberQuestions;

public class PrintEvenOddFromArray {

	public static void main(String[] args) {
	int array[] = {23,44,54,3,5,7,65,47,97,63,2,9};
	int len= array.length;
	
	for(int i=0; i<=len;i++) {
		if(array[i]%2==0) {
			System.out.println("Odd Number"+array[i]);
		}
		
		if (array[i]%2!=0){
			System.out.println("Even Number "+array[i]);
		}
	}
	

	}

}
