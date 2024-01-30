package practicemain;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		int len = str.length();
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
			if(str.equalsIgnoreCase(rev)) {
				System.out.println("Palindrome string");
			}
			else {
				System.out.println("Not palindrome string");
			}
		}

	}

