//Grades.java
//Depending grade display a message
import java.util.Scanner;

public class Grades
{
	public static void main(String[] args)
	{
		//scan number
	Scanner input = new Scanner(System.in);
	
	int grade;//read grade
	System.out.printf( "Enter grade ");
	grade=input.nextInt();
	
	if (grade != 100)
	
		if (grade >= 90)grade=90;
		else if (grade >= 80)grade = 80;
		else if (grade >= 70)grade = 70;
		else if(grade <= 69)grade = 50;
		
	
	switch (grade)
	{
	case 100:System.out.println ( "Excellent\n");
		break;
	case 90:System.out.println ( "Very Good\n");
		break;
	case 80:System.out.println ( "Good\n");;
		break;
	case 70:System.out.println ( "Not very Good\n");
		break;
	
	case 50:System.out.println ( "Fail\n");
		break;

	default:System.out.println ( "Error\n");
		break;
	}
	
	}
}
