package NumberQuestions;

public class ReverseNumver {

	public static void main(String[] args) {
		
		// 1st way - Using algorithm
		
		int num=1234;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		
		}
		System.out.println(rev);
		
		
		
		// 2nd - By using StringBuffer Class
		
	   int num2= 9876;
	   StringBuffer  str = new StringBuffer(String.valueOf(num2));
	  StringBuffer rev2= str.reverse();
	  System.out.println(rev2);
	  
	  
	  //3rd by using StringBuilder
		
	  int num3=54321;
	  StringBuilder stb= new StringBuilder();
	  stb.append(num3);
	 StringBuilder rev3= stb.reverse();
	 System.out.println(rev3);
	 	   
	  
	  
	  
	  
	}

}
