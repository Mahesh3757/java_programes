import java.util.*;
public class Factorial {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to find the factorial :");
        int number = sc.nextInt();
       long fact = factorial(number);
        System.out.println("Factorial of " + number + " is " + fact);
    }

    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }
}
