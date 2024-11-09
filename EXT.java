//CLASS MECHANISM
import java.util.*;
class Sample
{
     static void display()
     {
         System.out.println("Static method");
     }
     int add(int a,int b)
     {
         return (a+b);
     }
     public static void main(String[]args)
     {
         display();
         Sample s=new Sample();
         int sum=s.add(7,4);
         System.out.println("Addition: "+sum);
     }
}
//CONSTRUCTOR
import java.util.*;
class Student
{
     String sname;
     int regno;
     Student()
     {
         sname="cse";
         regno=23;
     }
     Student(String name,int num)
     {
         sname=name;
         regno=num;
     }
     public static void main(String [] args)
     {
         Student s1=new Student();
         Student s2=new Student("ece",32);
         System.out.println(s1.sname);
         System.out.println(s2.sname);
         System.out.println(s1.regno);
         System.out.println(s1.regno);
     }
}
//CON OVERLOADING
class A
{
    A()
    {
        System.out.println("Default constructor");
    }
    A(int n)
    {
         System.out.println("Value of n is "+n);
    }
    public static void main(String[]args)
    {
        A obj=new A();
        A obj1=new A(6);
    }
}
//METHOD OVERLOADING
class Test
{
    void add(int a,int b)
    {
        System.out.println("Addition: "+(a+b));
    }
    void add(int a,int b,int c)
    {
         System.out.println("Addition: "+(a+b+c));
    }
    public static void main(String[]args)
    {
        Test t=new Test();
        t.add(1,4);
        t.add(2,6,8);
    }
}
//SINGLE INHERITANCE
class A
{
    public void methodA()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    public void methodB()
    {
        System.out.println("Class B"); 
    }
    public static void main(String[]args)
    {
        B obj=new B();
        obj.methodA();
        obj.methodB();
    }
}
//ABSTRACT SHAPES
import java.util.*;
abstract class Shape
{
    abstract double area();
}
class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape
{
    double length,width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    double area()
    {
        return length*width;
    }
}
class Triangle extends Shape
{
    double base,height;
    Triangle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    double area()
    {
        return 0.5*base*height;
    }
}
class Main
{
    public static void main(String[]args)
    {
        Circle c=new Circle(2);
        Rectangle r=new Rectangle(2,3);
        Triangle t=new Triangle(2,4);
        System.out.println("Area of circle "+c.area());
          System.out.println("Area of rectangle "+r.area());
            System.out.println("Area of triangle "+t.area());
        
    }
}
//MULTI-LEVEL IN
class A
{
    public void methodA()
    {
        System.out.println("class A");
    }
}
class B extends A
{
    public void methodB()
    {
        System.out.println("class B");
    }
}
class C extends B 
{  public void methodC()
    {
        System.out.println("class C");
    }
    public static void main(String[]args)
    {
        C obj=new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
    
//SUPER
 class A
{
     float salary=10000.0f;
     void test()
     {
         System.out.println("Parent class method");
     }
}
class B extends A
{
        float salary=20000.0f;
        void display()
        {
            System.out.println("Salary: "+super.salary);
        }
        void test()
        {
            System.out.println("Child class method");
        }
        void show()
        {
            super.test();
            test();
        }
}
class C
{
    C()
    {
        System.out.println("Parent class constructor");
    }
}
class D extends C
{
    D()
    {
        super();
        System.out.println("Child class constructor");
    } 
   
}
class Main
{
    public static void main(String[]args)
    {
        B obj=new B();
        obj.display();
        obj.show();
        D obj1=new D();
        
    }
}
//MULTI-LEVEL
interface A
{
    void showA();
}
interface B
{
    void showB();
}
interface C
{
    void showC();
}
 class Main implements A,B,C
{
    public void showA()
    {
        System.out.println("Interface A");
    }
     public void showB()
    {
        System.out.println("Interface B");
    }
     public void showC()
    {
        System.out.println("Interface C");
    }
    public static void main(String[]args)
    {
        Main o=new Main();
        o.showA();
        o.showB();
        o.showC();
        
    }
}
//ARMSTRONG
import java.util.*;
class Armstrong
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int n=sc.nextInt();
        System.out.println("Enter num of dig");
        int ndig=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=Math.pow(rem,ndig);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
             System.out.println(" Not Armstrong");
        }
    }
}
//MULTIPLE CATCH
class Test
{
    public static void main(String[]args)
    {
        try
        {
            String str=null;
            System.out.println(str.length());
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception");
        }
         catch(ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println("ArrayIndexOutOfBounds Exception");
        }
         catch(NullPointerException ae)
        {
            System.out.println("NullPointer Exception");
        }
    }
}
//METHOD OVERRIDING
class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is running");
    }
    public static void main(String[]args)
    {
        Bike obj=new Bike();
        obj.run();
    }
}
//EHM
import java.util.*;
class Test
{
    public static void main(String[]args)
    {
        try
        {
            System.out.println(34/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
        finally
        {
            System.out.println("Finally block");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        try
        {
            
            int a=sc.nextInt();
            validate(a);
        }
        catch(InputMismatchException ime)
        {
             System.out.println("InputMismatchException");
        }
    }
    
}
public class User
{
        public static void validate(int age) 
        {
            if(age<18)
            {
                throw new ArithmeticException("Not eligible to vote");
            }
            else
            {
                System.out.println("Eligible");
            }
                
            
        }
        
    
}
//throw
import java.util.*;
class Test
{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter age");
    int a =sc.nextInt();
    User.validate(a);
    }
}
class User
{
    public static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not eligible");
        }
        else
        {
            System.out.println("Eligible");
        }
    }
}
