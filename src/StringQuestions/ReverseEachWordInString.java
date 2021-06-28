package StringQuestions;

public class ReverseEachWordInString {

	public static void main(String[] args) {
	
	String line = " I am trying to solve java questions";
	String k= "";
	int len = line.length();
	for(int i=0; i<len; i++) {
		if((line.charAt(i)==' ') && (line.charAt(i)!=' ')) {
			for(int j=len-1; j>0; j--) {
				k=k+ line.charAt(j);
			}
			
		}
	}
	
	System.out.println(k);
	}

}