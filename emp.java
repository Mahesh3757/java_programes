class emp
{
	int bs=9000,Agp,Gs,Deduction,Nets,At,S,bh;
	
	
	void Ag()
	{
		System.out.println(" Calculating Agp of Basic Salary ");
		Agp=9000*20/100;
		System.out.println("Agp is ="+Agp);
	}
    
       void Gross_Salary()
	{
		System.out.println("Calculating the Gross Salary of employee ");
		Gs=bs+Agp;
		System.out.println("Gross Salary = "+Gs);
	}
	void Deduct()
	{
		System.out.println("Calculating the Deduction");
		Deduction=Gs*5/100;
		System.out.println("Deduction Salary is ="+Deduction);
	}
	void Net_salary()
	{
		System.out.println("Calculating the Net salary ");
		Nets=Gs-Deduction;
		System.out.println("Net Salary is ="+Nets);
	}
	void attend()
	{
		System.out.println("Employee Salary according to Attendance in a month ");
		At=Nets/31;
		System.out.println("Employee  deduction salary for 1 Day is = "+ At);
		S=At*10;
		System.out.println("10 Days in leave his salary is educted now "+S);
		bh=Nets-S;
		System.out.println("By hand salary is = "+bh);
	}

public static void main(String args[])
{
	emp e1 = new emp();
	e1.Ag();
	e1.Gross_Salary();
	e1.Deduct();
	e1.Net_salary();
	e1.attend();
}
}