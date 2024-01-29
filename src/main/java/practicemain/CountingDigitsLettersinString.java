package practicemain;

public class CountingDigitsLettersinString {

	public static void main(String[] args) {
		String str = "Hello123GoingHome";
		int letterCount = 0;
		int digitCount = 0;
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				letterCount++;
			}
			if(Character.isDigit(ch)) {
				digitCount++;
			}
		}
		System.out.println("Number of alphabets in a string: "+letterCount);
		System.out.println("Number of numerals in a string: "+digitCount);

	}

}
