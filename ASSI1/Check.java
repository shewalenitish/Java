import primeno.*;
import perfectno.*;
import armstrongno.*;
import java.util.*;

public class Check {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number elements to check");
      int a=sc.nextInt();
      for(int i=0; i<=a; i++)
      {
        System.out.println("ENter the number:")
        int n=sc.nextInt();
        Prime obj=new Prime(n);
        obj.isPrime();
  
        perfect obj2=new perfect(n);
        obj2.isPerfect();
  
        Armstrong obj3=new Armstrong(n);
        obj3.isArm();
      }
      sc.close(); 
    }
}



   

