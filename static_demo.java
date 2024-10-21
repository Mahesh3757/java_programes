class static_demo
{
 static int count=10;
 static int showcount()
 {
   return count;
 }

 public static void main(String args[])
 {
   int n=static_demo.showcount();
   System.out.println(n);
 }
}