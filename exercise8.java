//write a java program that import and use the user-defined packages
//gedit PackDemo.java
  package pack;
  public class PackDemo
  {
      public void show()
     {
         System.out.println("User-defined packages");
     } 
  }
//gedit Check.java
import pack.PackDemo;
class Check
{
     public static void main(String[]args)
     {
          PackDemo obj=new PackDemo();
          obj.show();
     }
}     
/* javac -d . PackDemo.java
  javac Check.java
  java Check */


          
