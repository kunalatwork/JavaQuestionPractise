package NumberQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	int num = 1234321;
	int temp = num;
	int rev = 0;
	
	while(num!=0) {
	int rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	System.out.println();
	}
	
	if(rev==temp) {
		System.out.println("Number is Palindorme");
	}
	else {
		System.out.println("Number is not Palindrome");
	}

	}

}
