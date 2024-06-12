import java.util.*;
class ExceptionHandling{

    void divide(){
       try{
        int a=100;
        int b=0,c;
        c=a/b;
        System.out.println(c);
       }
       catch(Exception e){
           //e.printStackTrace();
       }
    }
    public static void main(String args[]){
      ExceptionHandling t=new ExceptionHandling();
      t.divide();
      System.out.println("Himanshu Mishra!");
    }
}