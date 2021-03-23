package grades;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;

/** 
 * A GradeManager will create a command-line prompt that will let someone add grades
 * and display grades in histogram format.
 * 
 */

public class GradeManager {
	int size = 0;
	// Keeps track of the number of each grade this has
	private HashMap<LetterGrade,Integer> allGrades;

	/**
	 * Creates a new GradeManager.
	 */
	public GradeManager() {
		// Create a new HashMap of the grades
		this.allGrades = new HashMap<LetterGrade,Integer>();
		
		// Add in all grades and set the occurance to 0
		for (LetterGrade gl : LetterGrade.values()) {
			allGrades.put(gl, 0);
		}
	}
		
	/**
	 * Adds grade to this GradeManager.
	 * @param grade - grade to add to this grad manager
	 */
	public void addGrade(String grade) throws InvalidGradeException {
		if (grade.equals("a")) {
			allGrades.put(LetterGrade.A, size);
			size++;
		} else if (grade.equals("b")) {
			allGrades.put(LetterGrade.B, size);
			size++;
		} else if (grade.equals("c")) {
			allGrades.put(LetterGrade.C, size);
			size++;
		} else if (grade.equals("d")) {
			allGrades.put(LetterGrade.D, size);
			size++;
		} else if (grade.equals("f")) {
			allGrades.put(LetterGrade.F, size);
			size++;
		} else throw new InvalidGradeException(grade + " is not acceptable!");	
		// TODO: Add more cases in here
		
		// If grade doesn't match a valid grade, throw an InvalidGradeException
	}

	/**
	 * Prints out a histogram of the grades to the console.
	 *
	 */
	public void printHistogram() {
		try { 
			String hs = getHistString();
			System.out.println(hs);
		} catch (Exception e) {
			throw new RuntimeException("GradeManger.printHistogram() not yet implemented!");
		}
	}
	
	/**
	 * Returns a string representation of the histogram of the grades.
	 * @return a string representation of the histogram of the grades.
	 */
	public String getHistString() {
		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) {
			sb.append( gl+":");
			for (int i = 0; i < this.allGrades.get(gl); i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Simple loop that accepts 3 commands from System.in:
	 *    add <some grade> : for example, "add a" or "add b"
	 *                       adds the given grade to the GradeManager
	 *    print            : prints out all the grades in this GradeManager
	 *                       in a histogram format
	 *    exit             : exits the program
	 * @param args
	 * @throws InvalidGradeException 
	 */
	public static void main(String[]  args) throws IOException, InvalidGradeException {
		GradeManager gm = new GradeManager();
		
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Starting the grade manager");
		
		while (true) {
			String input = cin.readLine();
				
			if (input.startsWith("add")) {
				String[] str = input.split(" ");
				String str1 = str[1];
				gm.addGrade(str1);
						
			} else if (input.equals("print")) {
				gm.printHistogram();
			}  else if (input.equals("exit")) {
				break;
			}
			
		}
	}

}