package practicemain;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		long fact = 1;
		//Ascending order
		for (int i =1; i<=num;i++) {
			fact = fact*i;
		}
		//Descending order
//		for(int i=num;i>=1;i--) {
//			fact = fact*i;
//		}
		System.out.println("The factorial of a given number is: "+fact);
	}

}
