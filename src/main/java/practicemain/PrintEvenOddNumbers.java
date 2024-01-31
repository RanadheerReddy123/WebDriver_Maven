package practicemain;

public class PrintEvenOddNumbers {

	public static void main(String[] args) {
		int a[] = {2,5,3,7,1,6};
		//Extracting even numbers from array
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.println("The even numbers in an array is: "+a[i]);
//			}
//		}
		//Extracting odd numbers from array
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2!=0) {
//				System.out.println("The odd numbers in an array is: "+a[i]);
//			}
//		}
		//Extracting even number from array
		for(int each:a) {
			if(each%2==0) {
				System.out.println("The even numbers in an array is: "+each);
			}
		}
		//Extracting odd numbers in an array
		for(int each:a) {
			if(each%2!=0) {
				System.out.println("The odd numbers in an array is: "+each);
			}
		}

	}

}
