/** Program Name: Same 
    Date: 12/10/18
    Student Name: Anirudh Margasahayam
    Intro to Programming - Section: Eighth-Period 
    Instructor: Mrs. Flood **/

import java.util.Scanner;

public class NumberAssortment
{
    public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer");
    int num = in.nextInt();
     System.out.println("You have "+(numDigits(num))+" digits");// print statments for the output
     System.out.println("The last digit is "+(lastDigits(num)));
      System.out.println("The first digit is "+(firstDigits(num)));
     
    
   }
  //gets the number of digits
       public static int numDigits(int x) {
         int random= x;
         int count= 1;
   
        while (random >=10)
     {
       
       random = random/10;
        count = count + 1;
     }
     return count;
    }
 

//gets the last digit 
public static int lastDigits(int x) {
         int random= x;
       
      
        while (random > 10)
     {
       random = random%10;
 
     }
     return random;
    }
//gets the first digit
public static int firstDigits(int x) {
         int random= x;
         int count= 1;
        
        while (random > 10)
     {
       random = random/10;
 
     }
     return random;
    }

}























