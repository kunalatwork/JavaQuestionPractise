package NumberQuestions;

public class Even_OddNumberInNumber {

	public static void main(String[] args) {

		int num=12323452;
		int count=0;
		int count1=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
		
		if(rem%2==0) {
			count++;
		}
		else if(rem%2!=0) {
			count1++;
		}
		}
		
		System.out.println("Total odd = "+count +" and Total Even = " +count1);
	}

}
