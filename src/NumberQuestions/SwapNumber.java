package NumberQuestions;

public class SwapNumber {

	public static void main(String[] args) {
		
	// 1st way
	int a=10;
	int b= 30;
	int temp = 0;
	
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("A = "+a + " B = "+b);
	
	//2nd Way
	int a1=20;
	int b1= 30;
	
	a1=a1+b1;
	b1=a1-b1;
	a1=a1-b1;
	
	System.out.println("A = "+a1 + " B = "+b1);
	
	}

}
