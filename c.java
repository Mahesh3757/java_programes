import java.util.*;
class a
{
	int a=10;
	int c,d;
	void add(int n)
	{
		 c= a+n;
		
	}
}

class b extends a
{
	void addition(int m)
	{
		 d = c+m;
	
	}
}

class c extends b
{
	void adding(int o)
	{
		int e=d+o;
		System.out.println("Addition of Numbers are :"+ e);
	}
	
	public static void main(String args[])
	{
		c obj=new c();
		obj.add(10);
		obj.addition(5);
		obj.adding(1);	
	}

}