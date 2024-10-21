class Fibonacci
{
    public static void main(String[] args)
    { 
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series up to  numbers:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
