package practicemain;

public class Prime {

	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		if(num>1) {
			for(int i =1;i<=num;i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("Successfully we got a Prime number");
			}
			else {
				System.out.println("The number given is not a prime number");
			}
		}
		else {
			System.out.println("The number given is not an positive number");
		}

	}

}
