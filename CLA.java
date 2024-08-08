//
import java.util.*;
class CLA
{
   public static void main(String[]args)
   {
        System.out.println("The first argument is "+args[0]);
        System.out.println("The second argument is "+args[1]);
   }
}        
//
import java.util.*;
class CLA
{
   public static void main(String[]args)
   {
     for(int i=0;i<args.length;i++)
     {
     System.out.println(args[i]);
     }  
   }}
      //
import java.util.*;
class Foreach
{
   public static void main(String[]args)
   {
        int arr[]={10,11,12,13};
        for (int i:arr)
        {
           System.out.println(i);
         }
    }
}           
//
import java.util.*;
class Total
{
   public static void main(String[]args)
   {
        int arr[]={10,11,12,13};
        int total=0;
        for (int i:arr)
        {
            total+=i;
         }
          System.out.println("The total is "+total);
    }
}           
