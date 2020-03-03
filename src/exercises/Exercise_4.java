package exercises;

public class Exercise_4 {

	private static Double[] vec1 = new Double[] {12.0, 7.0, 3.0, 5.00, 1.0, 5.0};
	private static Double[] vec2 = new Double[6];
	private static Double[] vec3 = new Double[6];
	private static Double[] vec4 = new Double[6];
	private static Double[] vec5 = new Double[6];
	
	private static int[] vecMultiplier = new int[] {2, 4, 6, 8, 10, 12};
	
	private static void mathSQRT () {
		for (int i = 0; i < vec1.length; i++) vec2[i] = Math.sqrt(vec1[i]);
		for (int i = 0; i < vec2.length; i++) System.out.println("SQRD " + i + ": " + vec2[i] + " | ");

	}
	
	private static void mathMultiplier () {
		for (int i = 0; i < vec3.length; i++) vec3[i] = vec1[i] * vecMultiplier[i];
		for (int i = 0; i < vec3.length; i++) System.out.println("Multiplier " + i + ": " + vec3[i] + " | ");

	}
	
	private static void mathPOW () {
		for (int i = 0; i < vec4.length; i++) vec4[i] = Math.pow(vec1[i], i);
		for (int i = 0; i < vec4.length; i++) System.out.println("POW " + i + ": " + vec4[i] + " | ");
	}
	
	private static void mathBi () {
		for (int i = 0; i < vec5.length; i++) {
			if ( vec1[i] >= 5) vec5[i] = 1.0;
			else vec5[i] = 0.0;
		}
		for (int i = 0; i < vec5.length; i++) System.out.println("B " + i + ": " + vec5[i] + " | ");
	}
	
	public static void main(String[] args) {
		
		mathSQRT();
		mathMultiplier();
		mathPOW();
		mathBi();
	}
}
