//GM HELLO WELCOME (THREAD)
import java.util.*;
class ThreadExample
{
    public static void main(String[]args)
    {
        Morning m=new Morning();
        Hello h=new Hello();
        Welcome w=new Welcome();
        m.start();
        h.start();
        w.start();
    }
}
class Morning extends Thread
{
    public void run()
    {
       try
       {
       while(true)
       {
        System.out.println("Good morning");
        Thread.sleep(1000);
       }
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
    }
}
class Hello extends Thread
{
    public void run()
    {
       try
       {
           while(true)
           {
        System.out.println("Hello");
        Thread.sleep(2000);
       }
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
    }
}
class Welcome extends Thread
{
    public void run()
    {
       try
       {
           while(true)
           {
       
       
        System.out.println("Welcome");
        Thread.sleep(3000);
       }
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
    }
}
//GM HELLO WEL(RUNNABLE)
import java.util.*;
class ThreadExample
{
    public static void main(String[]args)
    {
        Thread m=new Thread(new Morning());
        Thread h=new Thread(new Hello());
        Thread w=new Thread(new Welcome());
        m.start();
        h.start();
        w.start();
    }
}
class Morning implements Runnable
{
    public void run()
    {
       try
       {
       while(true)
       {
        System.out.println("Good morning");
        Thread.sleep(1000);
       }
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
    }
}
class Hello implements Runnable
{
    public void run()
    {
       try
       {
           while(true)
           {
        System.out.println("Hello");
        Thread.sleep(2000);
       }
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
    }
}
class Welcome implements Runnable
{
    public void run()
    {
       try
       {
           while(true)
           {
       
       
        System.out.println("Welcome");
        Thread.sleep(3000);
       }
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
    }
}
