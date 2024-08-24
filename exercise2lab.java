//Constructor
import java.util.*;
class Student
{
   String branch;
   int rollno;
   Student()
   {
      branch="CSE";
      rollno=05;
   }
   Student(String str,int n)
   {
      branch=str;
      rollno=n;
   }
   public static void main(String args[])
   {
        Student obj1=new Student();
        Student obj2=new Student("IT",12);
        System.out.println(obj1.branch);
        System.out.println(obj1.rollno);
        System.out.println(obj2.branch);
        System.out.println(obj2.rollno);
   }
}           
/*CSE 
  5
  IT
  12*/
//Constructor Overloading
import java.util.*;
class Over
{
   Over()
   {
      System.out.println("Default constructor");
   }
   Over(int n)
   {
       System.out.println("Value of n is "+ n);
   }
   public static void main(String args[])
   {
       Over obj1=new Over();
       Over obj2=new Over(7);
   }
}  
/*Default constructor
  Value of n is 7*/
//CHECK
import java.util.*;
class Clss
{
    static void program()
    {
        System.out.println("You entered a method");
    }
    int sum(int a,int b)
    {
         System.out.println(+(a+b));
         return a+b;
    }
    
    public static void main(String[]args)
    {
         program();
         Clss obj=new Clss();
         obj.sum(5,4);
    }
}             
