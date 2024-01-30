package practicemain;

public class CountingEvenOddDigitsinNumber {

	public static void main(String[] args) {
		int num = 123456;
		int even_digits = 0;
		int odd_digits = 0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				even_digits++;
			}else {
				odd_digits++;
			}
			num = num/10;
		}
		System.out.println("The even digits in a given number is: "+even_digits);
		System.out.println("The odd digits in a given number is: "+odd_digits);

	}

}
