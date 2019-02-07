//Grades.cpp
#include<iostream>
using namespace std;

int main()
{
	int grade, call;
	cout << "Enter grade ";
	cin >> grade;
	if (grade != 100)
	
		if (grade >= 90)grade =90;
		else if (grade >= 80)grade = 80;
		else if (grade >= 70)grade = 70;
		else if (grade <= 69)grade = 50;
			
	switch (grade)
	{
	case 100:cout << "Excellent" << endl;
		break;
	case 90:cout << "Very Good" << endl;
		break;
	case 80:cout << "Good" << endl;
		break;
	case 70:cout << "Not so good" << endl;
		break;
	case 50:cout << "Fail" << endl;
		break;

	default:cout << "Error"<<endl;
		break;
	}
	system("pause");
}
