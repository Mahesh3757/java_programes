abstract class animal
{
	abstract void dog()
	{
		System.out.println("Dog is an Animal ");
	}

}

abstract class Cat extends animal
{
	abstract void cat()
	{
		System.out.println("Cat is Animal");
	}

public static void main(String args[])
{
	Cat c=new Cat();
	c.dog();
	c.cat();
}
}