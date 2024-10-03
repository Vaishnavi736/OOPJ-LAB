//EXCEPTION HANDLING TECHNIQUES
import java.util.*;
class ExceptionHandling
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        try
         {
            System.out.println("Enter numerator: ");
            int numerator = sc.nextInt();
             System.out.println("Enter denominator: ");
            int denominator = sc.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) 
        {
            System.out.println("Invalid input! Please enter integers only.");
        } 
      }
}
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
