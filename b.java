import java.util.*;
class a
{
	int a=10;
	void add(int n)
	{
		int c= a+n;
		System.out.println("Adding two numbers :"+c);
	}
}

class b extends a
{
	public static void main(String args[])
	{
		b obj=new b();
		obj.add(10);
	}
}