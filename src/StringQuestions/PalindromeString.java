package StringQuestions;

public class PalindromeString {
	public static void main(String[] args) {
		
		
		// by using StringBuilder
		
		String name="MADAMA";
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.reverse();
		String rev = builder.toString();
		if(rev.equals(name)) {
			
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		
		//By using Character concatenation 
		
		String name1="MADAM";
		String temp = name1;
		String rev1="";
		int len= name1.length();
		
		for(int i=len-1; i>=0; i--) {
		char ch=name1.charAt(i);
		rev1=rev1+ch;
		}
		
		if(rev1.equals(temp)) {
			
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		
		
		// By usingStingBuffer
		
		String name2="BOB";
		StringBuffer buffer = new StringBuffer(name2);
		buffer.reverse();
		String rev2=buffer.toString();
        if(rev2.equals(name2)) {
			
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		
		
	}

}
