import java.util.Scanner;
/** Date: 
    Student Name: Anirudh Margasahayam
    Intro to Programming - Section: Eighth-Period 
    Instructor: Mrs. Flood **/
public class interestrate
{
    public static void main(String[] args) 
{
         Scanner in = new Scanner(System.in);   //getting number 1
         System.out.print("Please enter a inital value:  ");//gets starting value
         System.out.println("");
          int initialbalance = in.nextInt();
          System.out.print("Please enter a annual interest rate:  ");// gets annual interest rate
         System.out.println("");
         double  intrate = in.nextInt();
          
         System.out.print("The initial value is: ");
          System.out.println(initialbalance);
          System.out.print("Annual interest rate in percent: ");
          System.out.println(intrate);
          
          double total = (initialbalance*(intrate/1200))+ initialbalance;//calculates month 1
          System.out.printf("After Month 1:%10.2f", total);
          
          System.out.println();
           total = (total *(intrate/1200))+ total;//calculates month 2
          System.out.printf("After Month 2:%10.2f ", total );
          
           System.out.println();
           total = (total*(intrate/1200))+ total;//calculates month 3
           System.out.printf("After Month 3:%10.2f ", total );
          
          
          
          
          
          
          
          
                               
         
          
        
         
         
         
         
         
         
         
       
         
         
  
         
         
         
        
 
        
        
    }
}
                                                                                                                                