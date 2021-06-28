package NumberQuestions;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		int num=12323452;
		int count=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count=count+rem;
	}

		
	System.out.println(count);
  }	
}
