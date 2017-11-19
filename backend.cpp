#include <iostream>
#include <string>

using namespace std;

int main()
{
	double monthbudget;
	double weekbudget;
	int count = 0;
	bool checkval;
	bool nextstep;
	string categories[3];
	double percents[3] = {0,0,0};
	double totalpct = 0;
	cout << "Enter your monthly budget: ";
	cin >> monthbudget;
	weekbudget = ((monthbudget*12)/365)*7;
	cout << endl << "Your total weekly budget is " << weekbudget << endl;
	do
	{
		cout << "Enter a category name: ";
		cin >> categories[count];
		cout << endl << "Enter the percentage of your budget you want to use on this category: ";
		do
		{
		checkval = 1;
		cin >> percents[count];
		totalpct += percents[count];
		if(totalpct > 100)
		{
			checkval = 0;
			totalpct -= percents[count];
			cout << "You don't have that much of your budget left.  Please enter a value less than or equal to " << 100-totalpct << "%: ";
		}
		} while (checkval == 0);
		count++;
		cout << endl << "Category added. Enter 1 to add another or 0 to move to next step: ";
		cin >> nextstep;
		cout << endl;
	} while(nextstep == true && count < 3);
	for(int i = 0; i < count; i++)
	{
		cout << "Your weekly budget for " << categories[i] << " is $" << weekbudget*(percents[i]*0.01) << endl;
	}
	return 0;
}
