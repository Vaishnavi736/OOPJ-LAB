//static keyword
import java.util.*;
class StaticKeyword
{
    static int x=7;
    static void display()
    {
        System.out.println("You entered static method");
    }
    static
    {
        System.out.println("You entered static block");
    }
    public static void main(String args[])
    {
                System.out.println("The static variable is "+x);
                display();
    }
}
/*You entered static block
The static variable is 7
You entered static method*/
//method overloading
import java.util.*;
class Mol
{
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
     void mul(int x,int y,int z)
     {
          System.out.println(x*y*z);
     }
     public static void main(String args[])
     {
         Mol over=new Mol();
        over.mul(3,4);
         over.mul(1,2,3);
     }
}
//THIS KEYWORD
import java.util.*;
class This
{
    int a=7;
     void display()
    {
        int a=3;
        System.out.println(a);
         System.out.println(this.a);
    }
     public static void main(String args[])
     {
         
         This over=new This();
          System.out.println(over.a);
         over.display();
         
       
     }
}
// 7 3 7 
//CONSTRUCTORS
import java.util.*;
class Student
{
    String bname;
    int num;
    Student()
    {
        bname="cse";
        num=4;
        
    }
    Student(String str ,int n)
    {
        bname=str;
        num=n;
    }
    public static void main(String []args)
    {
        Student s1=new Student();
         Student s2=new Student("ece",7);
         System.out.println(s1.bname);
         System.out.println(s1.num);
         System.out.println(s2.bname);
         System.out.println(s2.num);
         
         
         
        
    }
}
//FACTORIAL RECURSIVE
import java.util.*;
class Fact
{
    public static int fact(int n)
    {
        if(n==0||n==1)
        { return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[]args)
    {
        System.out.println(fact(4));
    }
}
//NUMBER PALINDROME RECURSIVE
import java.util.*;
class Palindrome
{
    static int rev(int n )
    {
        int sum=0;
        if(n==0)
        {
            return sum ;
        }
        else
        {
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
            return n;
        }
    }
    public static void main(String []args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        int sum=0;
        int temp=num;
        rev(num);
        if(sum==temp)
        {
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
        
    }
}
//STRING PALINDROME RECURSIVE
import java.util.*;
class StrPal
{
    static boolean checkPal(String str,int s ,int e)
    {
        if(s==e)
        {
            return true;
        }
        if(str.charAt(s)!=str.charAt(e))
        {
            return false;
        }
        if(s<e+1)
        {
            return checkPal(str,s+1,e-1);

        }
          return true;
    }
    static boolean isPal(String str)
    {
        int n=str.length();
        if(n==0)
        {
            return true;
        }
      
         return checkPal(str,0,n-1);
        
    }    
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            String word=sc.nextLine();
            if(isPal(word))
            {
                System.out.println(word+" is a PALINDROME");
            }
            else
            {
                  System.out.println(word+" is not a PALINDROME"); 
            }
            
        }

}
//STATIC NESTED CLASS
import java.util.*;
class Test
{
   int x=5;
   static int y=7;
   static class Nested
   {
       static int z=9;
       static void display()
       {
          // System.out.println("x is "+x);
           System.out.println("y is "+y);
           System.out.println("z is "+z);
       }
       void bracket()
       {
           // System.out.println("x is "+x);
           System.out.println("y is "+y);
           System.out.println("z is "+z);
       }
   }
   public static void main(String[]args)
   {
       Test.Nested.display();
       Test.Nested in=new Test.Nested();
       in.bracket();
   }
}
//NON-STATIC NESTED CLASS
import java.util.*;
class Outer
{
    int x=8;
    static int y=6;
    class Inner
    {
        void display()
        {
            System.out.println("x is "+x);
        }
    }
    public static void main(String[]args)
    {
        Outer out=new Outer();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
//NON-STATIC NESTED CLASS INSIDE A METHOD
import java.util.*;
class Outer
{
    int x=2;
    void test()
    {
        for(int i=0;i<=10;i++)
        {
            class Inner
            {
                void display()
                {
                System.out.println("x = "+x);
                }
             }
         Inner in=new Inner();
         in.display();
        }
    }
          public static void main(String[]args)
    {
        Outer out=new Outer();
        out.test();
    }
}
