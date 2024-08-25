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
//PALINDROME RECURSIVE
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
