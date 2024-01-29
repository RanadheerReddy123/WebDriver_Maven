package practicemain;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b= 11;
		System.out.println("Before swapping value of a: "+a+" b: "+b);
		/*with using third variable
		int t = a;
		a = b;
		b = t;
		System.out.println("After swapping value of a: "+a+" b: "+b);
		*/
		/*without using third variable and with +,-
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping value of a: "+a+" b: "+b);
		*/
		/*without using third variable and with *,/
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("After swapping value of a: "+a+" b: "+b);
		*/
		/*with logical operators
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swapping value of a: "+a+" b: "+b);
		*/
		//with only single line
		b = (a+b)-(a=b);
		System.out.println("After swapping value of a: "+a+" b: "+b);

	}

}
