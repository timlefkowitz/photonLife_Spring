//Fig. 18.11: TowersOfHanoi.java
// Towers of Hanoi solution with a recursive method.


/*

                                                   ###
                    TowersOfHanoi        . ..
                                        .  .              ##
                                        .  ..    ....
                                        . , .    .   ,
                                        . . .    .   .
                                     .. .  .. ...   ...   . ..


                                     The Towers of Hanoi is one of the classic problems every budding computer scientist must grapple with. Legend has it that in a temple in the Far East, priests are attempting to move a stack of golden disk from one diamond peg to another....


                                     The initial stack has 64 disks threaded onto one peg and arranged from bottom to top by decreasing size. The priests are attempting to move the stack from one peg to another under the constraints that exactly one disk is moved at a time and at no time and at no time may a larger disk be placed above a smaller disk. Three pegs are provided, one being used for temporarily holding disks. Supposedly, the world will end when the priests complete their task, so there's little incentive for us to facilitate their efforts.


                                     1. Move n -1 disk from peg 1 to peg 2, using peg 3 as a temporary holding area.
                                     2.move the last disk(the largest) from peg 1 to peg 3
                                     3.move n - 1 disk from peg 2 to peg3, using peg 1 as a temporary holding area.




                                     Hey guys, I learn so much from typing out from books. it enables me to learn in a fun way. Lets see how this algorithm works!
                                     this is from
                                     JAVA - HOW TO PROGRAM 10th edition, typed out by timothy lefkowitz.


                                    . . |
                                        |




 */



public class TowersOfHanoi
{


    //recursively move disks between towers
    public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg)
    {
        if (disks == 1)
        {
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
            return;
        }

        //recursion step -- move (disk - 1) disks from sourcePeg
        //to tempPeg using destinationPeg
//
//        int disks = 0;
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);

        //move last disk from sourcePeg to destinationPeg
        System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);

        //move (disks - 1) disk from sourcePeg to destinationPeg
        solveTowers(disks -1, tempPeg, destinationPeg, sourcePeg);
    }

    public static void main(String[] args)
    {
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg = 0;
        int totalDisks = 3;

        //initial nonrecursive call: move all disks.
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);


    }
}
