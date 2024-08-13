//PALINDROME
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
            
        }
      if(sum==temp)
      {
          System.out.println("Palindrome");
      }
      else{
           System.out.println("Not a Palindrome");
      }
    }
}
//ARMSTRONG for three digit
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
            
        }
      if(sum==temp)
      {
          System.out.println("Armstrong");
      }
      else{
           System.out.println("Not an armstrong");
      }
    }
}
//REVERSE
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
            
        }
    System.out.println(sum);
    }
    
}
    //PRIME NUM
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int count =0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
            count++;
        }
        }
        if(count==2){
             System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime"); 
        }
    }//STRONG NUM
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum =0;
        int temp=num;
        int rem=0;
        while(num>0)
        {
            int fact=1;
            rem=num%10;
            for(int i=1;i<=rem;i++)
            {
               fact=fact*i;
               System.out.println(fact+" ");//for understanding
            }
            sum+=fact;
             System.out.println(sum+" ");//for understanding
             
            num=num/10;
            
        }
      if(sum==temp)
      {
          System.out.println("Strong");
      }
      else{
           System.out.println("Not a strong");
      }
    }
}
    
}
//PRINT THE INDIVIDUAL DIGITS (REV ORDER)
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
          int num=sc.nextInt();
         System.out.println("Enter num of dig");
        
         int dig=sc.nextInt();
        int sum=0;
        int temp=num;
        int i =dig;
        while(num>0)
        {
            int rem=num%10;
             
             
                 System.out.println("digit at" + i +"position is "+ rem);
                 i--;
             
             num=num/10;
        }
      
    }
    
}
//PRINT THE INDIVIDUAL DIGITS(RIGHT ORDER)
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
            
        }
    System.out.println("The digits are: ");
        while(sum>0)
         {
             int rem=sum%10;
             System.out.println(rem);
             sum=sum/10;
         }
    }
}
//ARMSTRONG FOR ANY DIGIT
import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        
        float num=sc.nextFloat();
        System.out.println("Enter num of digits: ");
        int ndig=sc.nextInt();
        int sum=0;
        float temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum+=(Math.pow(rem,ndig));
            num=num/10;
            
        }
      if(sum==temp)
      {
          System.out.println("Armstrong");
      }
      else{
           System.out.println("Not an armstrong");
      }
    }
}

    

    
