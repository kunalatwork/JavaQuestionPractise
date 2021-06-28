package StringQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		
    // By using StringBuilder
		
	String word = "ABCDE";
	
	StringBuilder builder = new StringBuilder();
	builder.append(word);
	StringBuilder revbuilder=builder.reverse();
	System.out.println(revbuilder);
	
	
	// By Using StringBuffer
	
	String word2 = "A1B2C3D4";
	StringBuffer buffer = new StringBuffer(word2);
	StringBuffer a= buffer.reverse();
	System.out.println(a);
	
	
	
	// By Using character concatenation
	
	String word3 = "KUNAL";
	String rev = "";
	 int len = word3.length();
	 for(int i=len-1; i>=0; i--) {
	char ch= word3.charAt(i);
	rev=rev+ch;
	 }
	 System.out.println(rev);
	 
	
	 // By using character Array
	 
	String name = "JAI MATA DI";
	String Reverse = "";
	
	int length = name.length();
	for(int i=length-1; i>=0;i-- ) {
	char [] chart=name.toCharArray();
	Reverse = Reverse+chart[i];

	}
	System.out.println(Reverse);
	
	}
}
