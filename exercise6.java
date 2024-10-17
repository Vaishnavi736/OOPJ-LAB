//EXCEPTION HANDLING MECHANISM
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
        catch (ArithmeticException ae) 
        {
            System.out.println(ae);
        } catch (InputMismatchException ime) 
        {
            System.out.println(ime);
        } 
        finally
        {
            System.out.println("Finally!!,you entered finally block");
        }
   }     
}

//MULTIPLE CATCH CLAUSES
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
                
