package practicemain;

public class SumofDigitsinNumber {

	public static void main(String[] args) {
		int num = 1784329;
		int sum = 0;
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("The sum of digits in a given number is: "+sum);

	}

}
