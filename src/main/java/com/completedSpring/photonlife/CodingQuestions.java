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






        public static void main(String[] args)
        {

        }
}
