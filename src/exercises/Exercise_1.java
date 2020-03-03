package exercises;

public class Exercise_1 {

	private static int[] vec = {10, 7, 8, 3, 17, 1};
	private static int[] vec2 = {8, 32, 9, 1, 0, 4};
	private static int sum = 0;
	
	private static void soma () {
		for (int i = 0; i < vec.length; i++) sum += vec[i];
	}
	
	private static void somaPrint () {
		System.out.println(sum);		
	}
	
	private static void sqrtPrint () {
		System.out.println(Math.sqrt(sum));
	}
	
	private static void vecChange () {
		for (int i = 0; i < vec.length; i++) vec[i] += vec2[i];
	}
	
	private static void vecChangePrint () {
		 System.out.println(vec[0] + "|" + vec[1] + "|" + vec[2] + "|" + vec[3] + "|" + vec[4] + "|" + vec[5]);
	}
	
	public static void main(String[] args) {

		soma();
		somaPrint();
		sqrtPrint();
		vecChangePrint();
		
	}
}
