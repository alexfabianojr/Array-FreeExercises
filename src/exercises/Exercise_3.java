package exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise_3 {
	
	private static List<String> name = new ArrayList<String>();
	private static List<String> classtype = new ArrayList<String>();
	private static List<Integer> grade = new ArrayList<Integer>();
	
	private static String[] newName = {"Alex", "Manu", "Vitoria"};
	private static String[] newClassType = {"Programming", "Math", "Dance"};
	private static Integer[] newGrade = {10, 10, 10};
	
	private static void dataInput () {
		for (int i = 0; i < newName.length; i++) data(newName[i], newClassType[i], newGrade[i]);
	}
	
	private static void data (String name_paramiter, String classtype_paramiter, Integer grade_paramiter) {
		name.add(name_paramiter);
		classtype.add(classtype_paramiter);
		grade.add(grade_paramiter);
	}
	
	private static void dataPrint () {
		for (int i = 0; i < newName.length; i++) {
			System.out.println("Name: " + name.get(i));
			System.out.println("Class: " + classtype.get(i));
			System.out.println("Grade: " + grade.get(i));
			System.out.println("-----------");
		}
	}
	
	public static void main(String[] args) {
		
		dataInput();
		dataPrint();

	}
}
