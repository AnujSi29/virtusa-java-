import java.util.*;

class oct6_inheritance_private 
{
     static int a;
     int b;
   
      protected static void p()
      {
          a=10;
          //b=100;
          System.out.println("in base");


      }

    static
   {
       System.out.println("in base1");

 
   }

}


class derived extends oct6_inheritance_private 
{


    static
   {
       System.out.println("in derived1");

 
   }
    public static void main(String args[])

    {
      
        derived d = new derived();
        d.p();

            }

    static
   {
       System.out.println("in derived2");

 
   }



}