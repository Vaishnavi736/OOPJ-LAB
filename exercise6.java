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
        }
        catch (InputMismatchException ime) 
        {
            System.out.println(ime);
        }
         finally
        {
            System.out.println("You entered finally block");
        }
    
        try
        {
            System.out.println("Enter age");
            int a=sc.nextInt();
            validate(a);
        }
         catch (InputMismatchException ime) 
        {
            System.out.println(ime);
        } 
    }
        public static void validate(int age) throws ArithmeticException
        {
             if(age<18)
            {
                 throw new ArithmeticException("Not eligible to vote"); 
            }
            else
            {
                     System.out.println("Eligible to vote");
            }
        }
        
   }
//OUTPUT
Enter numerator: 
4
Enter denominator: 
0
java.lang.ArithmeticException: / by zero
You entered finally block
Enter age
7
ERROR!
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote
	at ExceptionHandling.validate(ExceptionHandling.java:49)
	at ExceptionHandling.main(ExceptionHandling.java:36)
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
//OUTPUT
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
//BUILT-IN EXCEPTIONS
import java.util.*;
class Built
{
      public static void main(String[]args)
      {
            try
            {
                 int arr[]=new int[5];
                 System.out.println(arr[10]);
            }
            catch(ArrayIndexOutOfBoundsException aiobe)
            {
                System.out.println(aiobe);  
            }
            try
            {
                  int a=56;
                  System.out.println(a/0);
            }
            catch(ArithmeticException ae)
            {
                System.out.println(ae);  
            }    
            try
            {
                 String str=null;
                 System.out.println(str.length());
            }      
            catch(NullPointerException npe)
            {
                  System.out.println(npe);
            }
            finally
            {
                  System.out.println("These are some of the built-in exceptions");
            }
       }                   
}       
//OUTPUT
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
java.lang.ArithmeticException: / by zero
java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
These are some of the built-in exceptions

//USER-DEFINED EXCEPTION	
import java.util.*;
public class Checks
{
      public static void main(String[]args)
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter age");
             int a=sc.nextInt();
             User.validate(a);
    }    
}
class User 
{
       public static void validate(int age) throws ArithmeticException
       {
            if(age<18)
            {
                 throw new ArithmeticException("Not eligible to vote"); 
            }
            else
            {
                     System.out.println("Eligible to vote");
            }
        }
}        
  //OUTPUT
Enter age
1
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote
	at User.validate(Checks.java:18)
	at Checks.main(Checks.java:9)
