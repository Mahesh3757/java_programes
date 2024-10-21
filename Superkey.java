import java.lang.*;
import java.util.*;
class Superkey
        
{
    int a=10;
    public void msg()
    {
        System.out.println("Variable of a  is = "+a);
    }
}
public class Skey extends Superkey
{
     int a=5   ;
    public void m()
            
    {
        
        System.out.println("Variable of super a is = "+super.a);
        System.out.println("Variable of  a is = "+a);
    }
    public static void main(String[] args) {
        Skey k=new Skey();
        k.msg();
        k.m();
    }
}
