/*



            Hello this is a secert file here where i will write out coding questions i want to memorize
 */



package com.completedSpring.photonlife;

public class CodingQuestions {


    private static void fizzbuzz(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if ((( i% 5 ) == 0) && ((i % 7) == 0))  // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if(( i % 5 ) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if(( i % 7 ) == 0) // Is it a multiple of 7?
            System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }


    private static void fizzbuzz2(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            if((( i % 5 ) == 0) && (( i % 7 ) == 0))
                System.out.println("FizzBuzz");
            else if(( i % 5) == 0)
                System.out.println("Fizz");
            else if(( i % 7) == 0) // Is it a multiple of 7?
                System.out.println("Buzz");
            else
                System.out.println(i);

        }

    }

    private static void fizzbuzz3(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            if(((i % 5) == 0) && (( i % 7) == 0))
            System.out.println("FizzBuzz");
            else if((i % 5) == 0)
                System.out.println("Fizz");
            else if((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }


    private static void fizzbuzz4(int num) {
        for (int i = 1; i <= num; i++)
        {
            if(((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if((i % 5) == 0)
                System.out.println("fizz");
            else if((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz5(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if(((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if((i % 5) == 0)
                System.out.println("Fizz");
            else if((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        }
    }

    private static void fizzbuzz6(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if(((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("Fizzbuzz");
            else if((i % 5) == 0)
                System.out.println("Fizz");
            else if((i % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz7(int num)
    {
        for(int i = 1 ; i <= num ; i++)
        {
            if(((i % 5) == 0) && (( i % 7 ) == 0))
                System.out.println("Fizzbuzz");
            else if((i % 5) == 0 )
                System.out.println("Fizz");
            else if((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz8(int num)
    {
        for (int i = 1; i <= num ; i++)
        {
            if(((i % 5) == 0) && (( i % 7 ) == 0))
               System.out.println("FizzBuzz");
            else if((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
            {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }





        public static void main(String[] args)
        {
        //fizzbuzz(100);
        //fizzbuzz2(30);
          //  fizzbuzz3(40);
            //  fizzbuzz4(55);
       // fizzbuzz5(70)    ;
        //fizzbuzz6(40);
          //  fizzbuzz6(40);
            fizzbuzz8(45);
        }
}
