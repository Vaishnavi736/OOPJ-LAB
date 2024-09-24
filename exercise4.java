//SINGLE INHERITANCE
import java.util.*;
class A
{
    public void methodA()
    {
        System.out.println("Parent class");
    }
}
class B extends A
{
    public void methodB()
    {
        System.out.println("Child class");
    }
    public static void main(String[]args)
    {
        B obj=new B();
        obj.methodA();
        obj.methodB();
    }
}
//MULTI LEVEL INHERITANCE
import java.util.*;
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
{
    public void methodC()
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
//ABSTRACT CLASS TO FIND AREAS OF DIFFERENT SHAPES

