package part_4;

public class Enum {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = Enum.MALE;
		gender1 = Enum.FEMALE;
		
		gender1 = "boy"; // Enum.MALE and Enum.FEMALE 외 다른 String 값도 들어갈 수 있음
		
		Gender gender2;
		gender2 = gender2.MALE;
		gender2 = gender2.FEMALE;
		
		gender2 = "boy";

	}

}

enum Gender{
	MALE,FEMALE;
}