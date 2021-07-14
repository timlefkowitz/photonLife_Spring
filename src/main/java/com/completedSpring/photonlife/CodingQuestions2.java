/*
      Hello here is a practice area where I will write out problems i'm trying to memorize
      
      
      
      1. Anagram's
      Anagrams are interesting because several versions of the same idea can be used as multiable tools
*/



/* function to check whether two strings are anagram of each other */
  static boolean areAnagram(char[] str1, char[] str2)
  {
   // Get lengths of both strings
      int n1 = str1.length  // we can change this to inputOne and inputTwo
      int n2 = str2.length
        
        // If Length of both strings is not same, then they cannot be anagram
        if(n1 != n2)
          return false;
        
        // Sort both Strings
       Arrays.sort(str1);
           Arrays.sort(str2);
    
    // Compare sorted Strings
    for(int i=0; i< n1; i++)
      if(str1[i] != str2[i])
        return false;
    
    return true;
  }

// Driver Code
public static void main(String[] args)
{
   char str1[] = {'t','e','s','t'} ;
   char str2[] = {'e','t','t','s'} ;
  
  
  //function call
  if(areAnagram(str1,str2))
    System.out.print("The two strings are" + " anagram of each other");
  else
    System.out.print("The two strings are not" + " anagram of each other");
}

}
