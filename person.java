public class person
{
	char name;
	char gender;
	int age;
	
		public void getname(name);
		{
			this.name = name;
			System.out.println("Name = "+name);
		}
		public void getage(age);
		{
			this.age = age;
			System.out.println("Age = "+age);
		}
		public void getgender(gender);
		{
			this.gender = gender;
			System.out.println("Gender = "+gender);
		}
		
		 public static void main(String args[])
		{

			person p=new person("Mahesh",22,"Male");
			p.getname("Mahesh");
			p.getage(21);
			p.getgender("Male");
		}
	
}