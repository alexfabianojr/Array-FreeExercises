package exercises;

public class Exercise_2 {
	
	private static String[] vec1 = new String[] {"ALEX", "ALINE", "MANU", "PAIZA"};
	private static String[] vec2 = {"MANU", "ALINE", "ALEX", "PAIZA"};
	
	private static int[] vec3 = new int[4];
	
	private static void equalsVec () {
		for (int i = 0; i < vec1.length; i++) 
			if (vec1[i] == vec2[i]) vec3[i] = 1;
			else vec3[i] = 0;
	}
	
	private static void vec3Code () {
		for (int i = 0; i < vec3.length; i++) System.out.println(vec3[i]);
	}
	
	private static void remove () {
		for (int i = 0; i < vec1.length; i++) 
			if ( vec2[i] == "ALINE") continue;
			else System.out.println(vec2[i]);
	}

	public static void main(String[] args) {

		equalsVec();
		vec3Code();
		remove();
	}
}
