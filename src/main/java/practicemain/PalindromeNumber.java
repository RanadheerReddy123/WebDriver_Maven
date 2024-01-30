package practicemain;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12321;
		int org_num = num;
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("The reverse of a given number is: "+rev);
		if(org_num == rev) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not a palindrome");
		}

	}

}
