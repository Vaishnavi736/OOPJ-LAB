//EXCEPTION HANDLING TECHNIQUES

//MULTIPLE CATCH CLAUSES
import java.util.*;
class Mce 
{
        public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);
          try
         {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber); 
          }
             catch (ArithmeticException e)
              {
                    System.out.println("Error: Cannot divide by zero.");
              }
             catch (InputMismatchException e)
              {
                    System.out.println("Invalid input! Please enter integers only.");
              } 
             catch (NumberFormatException e)
              {
                 System.out.println("Error: Invalid number format.");
              } 
             finally
              {
                sc.close();
                System.out.println("Scanner closed.");
              }
         }
}
//MULTIPLE CATCH BLOCKS
import java.util.*;
class Multiple
{
      public static void main(String[]args)
      {
            try
            {
                 int arr[]=new int[5];
                 System.out.println(arr[10]);
            }
            catch(ArithmeticException ae)
            {
                System.out.println(ae);
            }
            catch(ArrayIndexOutOfBoundsException aiobe)
            {
                 System.out.println(aiobe);  
            }
            catch(NullPointerException npe)
            {
                 System.out.println(npe);
            }
       }
 }                       
                
