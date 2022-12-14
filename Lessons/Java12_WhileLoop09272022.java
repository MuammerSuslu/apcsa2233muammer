package Lessons;

public class Java12_WhileLoop09272022
{
    public static void main(String[] args)
    {
         /*
        WHILE LOO
        while loop helps you to repeat processes as many times as you need/want
        each loop has initialization termination and increment
        as the condition is true loop keep running again and again.
        you can break the loop if you need
         */

        int a = 0; // starting point


        while (a<10) // this is my condition
        {
            System.out.println("print this 10 times");
            a++; // this is the increment it will increase the value of the value of a by one in each iteration

        }

        // DO WHILE LOOP
        // nobody knows why we need to do while loo[s since nobody use it.
        // it executes do statement whatever the condition then checks for while if it is valid.
        //if it is valid it runs. if it does not it stops.

        int n = 10;
        do {
            System.out.println("n = "+n);
        }
        while (n>10);
    }
}
