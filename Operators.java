//Operators in java
//Arithmetic Operators
import java.util.*;
class Arithmetic
{
  public static void main(String[]args)
  {
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Addition : "+(a+b));
     System.out.println("Subtraction : "+(a-b));  
     System.out.println("Multiplication : "+(a*b));
     System.out.println("Division : "+(a/b));   
     System.out.println("Modulo Division : "+(a%b));   
 }}

//Relational Operators
import java.util.*;
class Relational
{
  public static void main(String[]args)
  {
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Is a greater than b?"+(a>b));
     System.out.println("Is a less than b?"+(a<b));
     System.out.println("Is a greater than or equal to b?"+(a>=b));
     System.out.println("Is a less than b?"+(a<b));
     System.out.println("Is a less than or equal to b?"+(a<=b));
     System.out.println("Is a equal to b?"+(a==b));
     System.out.println("Is a not equal to b?"+(a!=b));
     }
     }
//Logical Operators
import java.util.*;
class Logical
{
  public static void main(String[]args)
  {
     int a;
     int b;
     int c;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a, b and c values");
     a=sc.nextInt();
     b=sc.nextInt(); 
     c=sc.nextInt();
     System.out.println((a<b)&&(a<c));
     System.out.println((a<b)||(a>c));
     System.out.println(!(a>b));
     }
     }

