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
//ARITHMETIC OPERATORS USING SWITCH
import java.util.*;
class Arithmetic
{
  public static void main(String[]args)
  {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println("Enter an arithmetic operator");
     char ch=sc.next().charAt(0);
     switch(ch)
     {
         case'+':
              System.out.println("Addition : "+(a+b));
              break;
         case '-':      
              System.out.println("Subtraction : "+(a-b));  
              break;
         case '*':
              System.out.println("Multiplication : "+(a*b));
               break;
         case '/':
              System.out.println("Division : "+(a/b));   
               break;
         case '%':
              System.out.println("Modulo Division : "+(a%b));   
               break;
        default:
                System.out.println("It's not an arithmetic operator");
       }
  }
}
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
// Bitwise Operators
import java.util.*;
class Bitwise
{
  public static void main(String[]args)
  {
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Bitwise OR: "+(a|b));
     System.out.println("Biwise AND: "+(a&b));  
     System.out.println("Complement: "+(~a));
     System.out.println("Left shift: "+(a<<1));   
     System.out.println(a<<2);
     System.out.println("Right shift: "+(b>>1));
     System.out.println(b>>2);
     
 }}
// Assignment Operators
import java.util.*;
class Assignment
{
  public static void main(String[]args)
  {
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Value of a is "+(a+=b));
     System.out.println("Value of a is "+(a-=b));  
     System.out.println("Value of a is "+(a*=b));
     System.out.println("Value of a is "+(a/=b));   
     System.out.println("Value of a is "+(a%=b));
 }}
// Increment and Decrement Operator
import java.util.*;
class Inc_Dec
{
  public static void main(String[]args)
  {
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Post increment: "+(a++));
     System.out.println("Value of a: "+a);
     System.out.println("Pre increment: "+(++a)); 
     System.out.println("Value of a: "+a);
     System.out.println("Post decrement: "+(b--));
     System.out.println("Value of b: "+b);
     System.out.println("Pre decrement: "+(--b)); 
     System.out.println("Value of b: "+b);
  }
}
// Conditional Operators
import java.util.*;
class Conditional
{
  public static void main(String[]args)
  {
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     a=sc.nextInt();
     b=sc.nextInt();
     int Min=(a<b)?a:b;
     int Max=(a>b)?a:b;
     System.out.println("Minimum is "+Min);
     System.out.println("Maximum is "+Max);
 }}
// Special Operators
import java.util.*;
class Inst
{
  public static void main(String[]args)
  {
     Inst obj=new Inst();
     System.out.println(obj instanceof Inst);
 }}
 //Special Operators
import java.util.*; 
class Instance
{
  public static void main(String[]args)
  {
     Instance obj=new Instance();
     System.out.println(obj instanceof Inst);
 }}
//Output
System.out.println(obj instanceof Inst);
                                       ^
  symbol:   class Inst
  location: class Instance
1 error



