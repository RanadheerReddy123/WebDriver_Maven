package practicemain;

public class CountingDigitsinNumber {

	public static void main(String[] args) {
		int num = 12356778;
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits in given number is: "+count);

	}

}
