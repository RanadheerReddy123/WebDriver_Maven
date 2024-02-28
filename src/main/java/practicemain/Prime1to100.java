package practicemain;

public class Prime1to100 {

	public static void main(String[] args) {
		
		String PrimeNumbers = "";
		for(int i=2;i<=100;i++) {
			int count = 0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					count++;
				}
				}
				if(count==2) {
					PrimeNumbers = PrimeNumbers+i+" ";
				}
			}
			System.out.println(PrimeNumbers);

		}
	
}


