import java.util.Scanner;
public class GPACalculator
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What letter grade did you get in math?");
		double math = GPA(keyboard.next());
		System.out.println("What letter grade did you get in english?");
		double english = GPA(keyboard.next());
		System.out.println("What letter grade did you get in history?");
		double history = GPA(keyboard.next());
		System.out.println("What letter grade did you get in science?");
		double science = GPA(keyboard.next());
		System.out.println("What letter grade did you get in Elective 1?");
		double elective1 = GPA(keyboard.next());
		System.out.println("What letter grade did you get in Elective 2?");
		double elective2 = GPA(keyboard.next());
		
		
		/*System.out.println("What letter grade did you get in math?");
		String mathGrade = keyboard.nextString();
		keyboard.nextLine();
				if (mathGrade.equalsIgnoreCase("A"))
					return 4;
				else if (mathGrade.equalsIgnoreCase("B"))
					return 3;
				else if (mathGrade.equalsIgnoreCase("C"))
					return 2;
				else if (mathGrade.equalsIgnoreCase("D"))
					return 1;
				else if (mathGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in English?");
			String englishGrade = keyboard.nextString();
			keyboard.nextLine();
				if (englishGrade.equalsIgnoreCase("A"))
					return 4;
				else if (englishGrade.equalsIgnoreCase("B"))
					return 3;
				else if (englishGrade.equalsIgnoreCase("C"))
					return 2;
				else if (englishGrade.equalsIgnoreCase("D"))
					return 1;
				else if (englishGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in Science?");
			String scienceGrade = keyboard.nextString();
			keyboard.nextLine();
				if (scienceGrade.equalsIgnoreCase("A"))
					return 4;
				else if (scienceGrade.equalsIgnoreCase("B"))
					return 3;
				else if (scienceGrade.equalsIgnoreCase("C"))
					return 2;
				else if (scienceGrade.equalsIgnoreCase("D"))
					return 1;
				else if (scienceGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in History?");
			String historyGrade = keyboard.nextString();
			keyboard.nextLine();
				if (historyGrade.equalsIgnoreCase("A"))
					return 4;
				else if (historyGrade.equalsIgnoreCase("B"))
					return 3;
				else if (historyGrade.equalsIgnoreCase("C"))
					return 2;
				else if (historyGrade.equalsIgnoreCase("D"))
					return 1;
				else if (historyGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in Elective 1?");
			String elective1Grade = keyboard.nextString();
			keyboard.nextLine();
				if (elective1Grade.equalsIgnoreCase("A"))
					return 4;
				else if (elective1Grade.equalsIgnoreCase("B"))
					return 3;
				else if (elective1Grade.equalsIgnoreCase("C"))
					return 2;
				else if (elective1Grade.equalsIgnoreCase("D"))
					return 1;
				else if (elective1Grade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in Elective 2?");
			String elective2Grade = keyboard.nextString();
			keyboard.nextLine();
				if (elective2Grade.equalsIgnoreCase("A"))
					return 4;
				else if (elective2Grade.equalsIgnoreCase("B"))
					return 3;
				else if (elective2Grade.equalsIgnoreCase("C"))
					return 2;
				else if (elective2Grade.equalsIgnoreCase("D"))
					return 1;
				else if (elective2Grade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in Elective 3?");
			String elective3Grade = keyboard.nextString();
			keyboard.nextLine();
				if (elective3Grade.equalsIgnoreCase("A"))
					return 4;
				else if (elective3Grade.equalsIgnoreCase("B"))
					return 3;
				else if (elective3Grade.equalsIgnoreCase("C"))
					return 2;
				else if (elective3Grade.equalsIgnoreCase("D"))
					return 1;
				else if (elective3Grade.equalsIgnoreCase("F"))
					return 0;
				
			System.out.println("Your GPA is" + ( mathGrade + englishGrade + historyGrade + scienceGrade + elective1Grade + elective2Grade + elective3Grade)/7 );
		
		
		if (classnum == 6)
			System.out.println("What letter grade did you get in math?");
			String mathGrade = keyboard.nextString();
			keyboard.nextLine();
				if (mathGrade.equalsIgnoreCase("A"))
					return 4;
				else if (mathGrade.equalsIgnoreCase("B"))
					return 3;
				else if (mathGrade.equalsIgnoreCase("C"))
					return 2;
				else if (mathGrade.equalsIgnoreCase("D"))
					return 1;
				else if (mathGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in English?");
			String englishGrade = keyboard.nextString();
			keyboard.nextLine();
				if (englishGrade.equalsIgnoreCase("A"))
					return 4;
				else if (englishGrade.equalsIgnoreCase("B"))
					return 3;
				else if (englishGrade.equalsIgnoreCase("C"))
					return 2;
				else if (englishGrade.equalsIgnoreCase("D"))
					return 1;
				else if (englishGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in Science?");
			String scienceGrade = keyboard.nextString();
			keyboard.nextLine();
				if (scienceGrade.equalsIgnoreCase("A"))
					return 4;
				else if (scienceGrade.equalsIgnoreCase("B"))
					return 3;
				else if (scienceGrade.equalsIgnoreCase("C"))
					return 2;
				else if (scienceGrade.equalsIgnoreCase("D"))
					return 1;
				else if (scienceGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in History?");
			String historyGrade = keyboard.nextString();
			keyboard.nextLine();
				if (historyGrade.equalsIgnoreCase("A"))
					return 4;
				else if (historyGrade.equalsIgnoreCase("B"))
					return 3;
				else if (historyGrade.equalsIgnoreCase("C"))
					return 2;
				else if (historyGrade.equalsIgnoreCase("D"))
					return 1;
				else if (historyGrade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in Elective 1?");
			String elective1Grade = keyboard.nextString();
			keyboard.nextLine();
				if (elective1Grade.equalsIgnoreCase("A"))
					return 4;
				else if (elective1Grade.equalsIgnoreCase("B"))
					return 3;
				else if (elective1Grade.equalsIgnoreCase("C"))
					return 2;
				else if (elective1Grade.equalsIgnoreCase("D"))
					return 1;
				else if (elective1Grade.equalsIgnoreCase("F"))
					return 0;
			System.out.println("What letter grade did you get in Elective 2?");
			String elective2Grade = keyboard.nextString();
			keyboard.nextLine();*/
				
		
		System.out.println("Your GPA is " + ( math + english + history + science + elective1 + elective2)/6 );
		}
	
	public static double GPA(String letter){
		if (letter.equalsIgnoreCase("A"))
			return 4;
		else if (letter.equalsIgnoreCase("B"))
			return 3;
		else if (letter.equalsIgnoreCase("C"))
			return 2;
		else if (letter.equalsIgnoreCase("D"))
			return 1;
		else
			return 0;
	}

}