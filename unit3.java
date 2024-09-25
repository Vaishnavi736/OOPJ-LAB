//SUPER KEYWORD (VARIABLE)
class Employ
{
 float salary=10000;
}
class HR extends Employ
{
    float salary=20000;
    void display()
    {
        System.out.println("The salary is "+ super.salary);
    }
    public static void main(String[]args)
    {
      HR obj=new HR();
      obj.display();
    }
    
}
//SUPER KEYWORD (METHOD)
class A
{
    void display()
    {
        System.out.println("Parent class");
    }
}
class B extends A
{
    void display()
    {
       System.out.println("Child class");
    }
    void test()
    {
        super.display();
        display();
    }
    public static void main(String[]args)
    {
        B obj =new B();
        obj.test();
    }
}
//SUPER KEYWORD (CONSTRUCTOR)

