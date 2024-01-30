package practicemain;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		int rand_num = rand.nextInt();
		System.out.println("The random number generated is: "+rand_num);
		
	}

}
