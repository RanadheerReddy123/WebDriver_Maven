package practicemain;

public class SumofElementsinArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum = 0;
		//By for loop
		//for(int i=0;i<a.length;i++) {
			//sum = sum + a[i];
		//}
		for(int each:a) {
			sum = sum + each;
		}
     System.out.println("The sum of elements in Array is: "+sum);
	}

}
