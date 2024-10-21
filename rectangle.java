class rectangle
{
	int l,b,s;
	void arec(int l,int b)
	{
		int arearec=l*b;
		System.out.println("Area of Rectangle= "+arearec);
	}
	void prec(int l,int b)
	{
		int perrec= l*b/2;
		System.out.println("Perimeter of rectangle is ="+perrec);
	}
	void asqr(int s)
	{
		int aresqr= s*s;
		System.out.println("Area of Square is = "+aresqr);
	}
	void psqr(int s)
	{
		int presqr= s+s;
		System.out.println("Perimeter of Square is = "+presqr);
	}
	public static void main(String args[])
	{
		rectangle rec=new rectangle();
		rec.arec(10,15);
		rec.prec(10,15);
		rec.asqr(10);
		rec.psqr(10);
	}
}