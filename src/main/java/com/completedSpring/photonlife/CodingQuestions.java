/*
            Hello this is a secert file here where i will write out coding questions i want to memorize
 */

//{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
//{}{}{}{}{}{}{}{}{}{}{}{}             packages        {}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
//{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

package com.completedSpring.photonlife;






public class CodingQuestions {


    //{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
    //{}{}{}{}{}{}{}{}{}{}{}{}            FizzBuzz          {}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
    //{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}


    private static void fizzbuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))  // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((i % 7) == 0) // Is it a multiple of 7?
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }


    private static void fizzbuzz2(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0) // Is it a multiple of 7?
                System.out.println("Buzz");
            else
                System.out.println(i);

        }

    }

    private static void fizzbuzz3(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }


    private static void fizzbuzz4(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("fizz");
            else if ((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz5(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        }
    }

    private static void fizzbuzz6(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("Fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz7(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("Fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz8(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }

    private static void fizzbuzz9(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz10(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.print("Buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzbuzz11(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.print("Buzz");
            else
                System.out.println(i);

        }
    }

    private static void fizzbuzz12(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println("Fizz");
            else if ((i % 7) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
            
            private static void fizzbuzz14 (int num)
            {
                        for(int i = 1; i <= num ; i++ )           
            }_        if (( i % 5) == 0)) && (( i % 7 ) == 0))
                        System.out.println("FizzBuzz");
            else if((i % 5) == 0)
                        System.out.print("Fizz")
                        else if ((i % 7)== 0)
                                    System.out.println("Buzz");
            else
                        System.out.println(i);
            }
}




           private static void fizzbuzz13(int num)
                        {
                         for (int i = 1; i <= num; i++)           
                        }          
                        if(((i % 5 ) == 0) && ((i % 7) == 0))  /// is it a multiable of 5 and 7
                                     System.out.print("Fizz BuzzzzzzzzzzzzzZZZzZZZ");
                                    else if((i % 5) == 0) // When it's a multiable of 5;
                                     System.out.print("Fizz");
                        {
                                    else if((if % 7) == 0) // When it's a multiable of 7
                        }
                                    System.out.print("Buzz");
                                                 else 
                                    System.out.println("Buzz");
                                                 else 
                                    System.out.println(i)
                        }
                       }


            private static void fizzbuzz14(int num) {
              for (int i = 1 ;i <= num ;i++ ){
                        if((i % 5) == 0) && (( i % 7) == 0))
                                    System.out.print("Fizz Buzz");
                          else if((i % 5) == 0)
                                      System.out.print("fizz");
                          else if((i % 7) == 0)
                                      System.out.print("Buzz");
                          else 
                                      System.out.print(i);
                                     
                                    
            }
                        
                        
                        // I like this writing vv


            static void fizzbuzz15(int num){
                        for(int i = 1 ;i <= num ;i++ ){
                                    if((i % 5) == 0) && ((i % 7) == 0))
                                                System.out.print("FizzBuzz");
                                    else if ((i % 5) == 0)
                                                System.out.print("Fizz");
                                    else if ((i % 7) == 0)
                                                System.out.print("Buzz"); // my flow is much better here
                                    else 
                                                System.out.print(i); // I keep putting println() i think thats not needed. just print()
                                    
                        }
            }
                                   
            
            
            
   

            /*
             //{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
           //{}{}{}{}{}{}{}{}{}{}{}{}             Fibonacci        {}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
           //{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}           Series         {}{}{}{}{}{}{}{}{}{}{}{}{}
            */

    static void Fibonacci(int num) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        //Iterate till counter is N
        while (counter < num) {
            //Print the number
            System.out.print(num1 + " ");

            //Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }

    }


    //=


    static void Fibonacci2(int num) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        //Iterate till counter is num
        while (counter < num) {
            //Print the number
            System.out.print(num1 + " ");

            //Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }


    //=


    static void Fibonacci3(int num) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        //Iterate till counter is num
        while (counter < num) {
            System.out.print(num1 + " ");

            //swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }


    //=


    static void Fibonacci4(int num) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        //Iterate till counter is num
        while (counter < num) {
            System.out.print(num1 + " ");

            //Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;


        }
    }


    //== ok one more for good messure.


    static void Fibonacci5(int num) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is num
        while (counter < num) {
            // Print the number
            System.out.print(num1 + " ");

            //Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;

        }
    }


    static void Fibonacci6(int num) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till the counter is num
        while (counter < num) {
            System.out.print(num1 + " ");

            //SWAP
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;


        }

    }


    static void Fibonacci7(int num) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < num) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;

        }
    }


    static void Fibonacci8(int num) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < num) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }


    static void Fibonacci9(int num) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < num) {

            System.out.print(num1 + "  ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;

        }

    }


    static void Fibonacci10(int num)
    {
        int num1 = 0, num2 =1;
        int counter = 0;
        while (counter < num ){
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter +1;
        }
    }



    static void Fibonacci11(int num)
    {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while(counter < num){
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter +1;
        }
    }
                        
                        
                        
                        // Ok we are going to write out some Fibonacci functions
                        
                        static void Fibonacci12(int num)
                        {
                                    int num1 = 0; int num2 = 1;
                                    int counter = 0;
                                    
                                    // Iterate till counter is num
                                    while(counter < num ){
                                                //print the number
                                                System.out.print(num1 + " ");
                                                
                                                // We will now swap the numbers
                                                int num3 = num2 + num1;
                                                num1 = num2;
                                                num2 = num3;
                                                counter  = counter + 1;
                                                
                                    }
                        }
                        
                        
                        static void Fibonacci13(int num)
                        {
                                    int num1 = 0; int num2;
                                    int counter = 0;
                                    
                                    //Iterate till counter is num
                                    while(counter < num){
                                                //print the number
                                                System.out.print(num1 + " " );
                                                
                                                // SWAP
                                                int num3 = num2 + num1;
                                                num1 = num2;
                                                num2 = num3;
                                                counter = counter + 1;
                                    }
                        }
                        
                        
                        static void Fibonacci14(int num)
                        {
                                    int num1 = 0; int num2;
                                    int counter = 0;
                                    
                                    //Iterate till counter is num
                                    while (counter < num){
                                                //print the number
                                                System.out.print(num1 + " ");
                                                
                                                //SWAP 
                                                int num3 = num2 + num1;
                                                num1 = num2;
                                                num2 = num3;
                                                counter = counter + 1;
                                    }
                                    
                        }
                        
                        
                                 











    //{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
            //{}{}{}{}{}{}{}{}{}{}{}{}             main            {}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
            //{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}


            public static void main(String[] args)
            {
                //fizzbuzz(100);
                //fizzbuzz2(30);
                //  fizzbuzz3(40);
                //  fizzbuzz4(55);
                // fizzbuzz5(70)    ;
                //fizzbuzz6(40);
                //  fizzbuzz6(40);
                //   fizzbuzz8(45);
                // fizzbuzz9(45);
//            fizzbuzz10(45);
//        fizzbuzz11(55);
                //fizzbuzz12(45);

                int num = 10;

                Fibonacci10(num);

            }


}
