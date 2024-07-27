import java.util.*;
class Quadratic
{
    public static void main(String args[])
    {
        float a;
        float b;
        float c;
        float D;
        double x;
        double y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c values ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        D = (b*b)-(4*a*c);
        if(D>0){
           x=(-b+Math.sqrt(D)) / (2*a);
           y=(-b-Math.sqrt(D)) / (2*a);
           System.out.println("x = " +x + "y = " + y);
           System.out.println("The roots are real,distinct and rational");
          }
        else if(D==0){
           x = -b/(2*a);
           System.out.println("x = " +x + "y = " + x);
            System.out.println("The roots are real and equal");
           }
        else{
                 System.out.println("The roots are imaginary");
           }
      }
}           

