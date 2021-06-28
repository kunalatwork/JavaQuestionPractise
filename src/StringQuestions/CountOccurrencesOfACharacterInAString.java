package StringQuestions;

public class CountOccurrencesOfACharacterInAString {

	public static void main(String[] args) {
		String line = "Count Occurrences of a Character in a String";
		int l=line.length();
		
		int  K=line.replace("a", "").length();
		int  h = l-K;
		System.out.println(h);
	}

}
