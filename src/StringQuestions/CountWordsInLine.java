package StringQuestions;

public class CountWordsInLine {

	public static void main(String[] args) {
		
		String line = "I love my wife";
		int count = 1;
		
		int len = line.length();
		for(int i=0; i<len; i++) {
			if((line.charAt(i)==' ') &&(line.charAt(i+1)!=' ')) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
