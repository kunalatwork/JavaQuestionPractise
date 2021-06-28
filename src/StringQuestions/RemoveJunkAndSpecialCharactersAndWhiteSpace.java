package StringQuestions;

public class RemoveJunkAndSpecialCharactersAndWhiteSpace {

	public static void main(String[] args) {
		
	// Remove junk and Special Character
	String line = "@#$%@$%@#$kunal #$%@$%@Rawat %@#$%@#$%Wants to go $%^$%^@maldives in December";
	
	line = line.replaceAll("[^a-zA-Z0-9 ]", "");
	System.out.println(line);
	
	
	// Remove white Space
    String line2 = "kunal Rawat Wants to go maldives in December With Wife";
	
	line2 = line2.replaceAll("\\s", "");
	System.out.println(line2);
	
	
	
	}

}
