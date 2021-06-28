package NumberQuestions;

public class SumOfNumberInArray {

	public static void main(String[] args) {
	int ar[]= {2,3,4,5,6,7,8,9};
	int sum=0;
	for(int i=0;i<ar.length;i++) {
	
		sum=sum+ar[i];
	}
	
	System.out.println(sum);
	}

}