import java.util.Scanner;
class leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year for check leap year or not ");
		int yr=sc.nextInt();
		if(yr%4==0)
		{
			System.out.println("Entered year is leap year");
		}
		else
		{
			System.out.println("Entered year is not an leap year");
		}
		
	}
}