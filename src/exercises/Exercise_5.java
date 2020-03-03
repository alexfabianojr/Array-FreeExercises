package exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise_5 {

	private static List<String> nameList = new ArrayList<>();
	
	private static void addMethod (String add1, String add2, String add3) {
		nameList.add(add1);
		nameList.add(add2);
		nameList.add(add3);
	}

	private static void convertNameToCodeMethod () {
		for (String c : nameList) {
			for (int i = 0; i < nameList.size(); i++) {
				String name = nameList.get(i);
				if (name == "ALEX") System.out.println("IT's MANU'S BROTHER");
				if (name == "MANU") System.out.println("IT'S ALEX'S SISTER");
				else  System.out.println("SOMEONE ELSE");;
			}
		}
	}
	
	public static void main(String[] args) {
		
		addMethod("ALEX", "MANU", "ROGER");
		convertNameToCodeMethod();
	}
}
