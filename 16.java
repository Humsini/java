import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int m=s.nextInt();
      int n=s.nextInt();
      for(int i=m+1;i<n;i++)
      {
          int count=0;
       for(int j=2;j<=i/2;j++)
       {
           
           if(i%j==0)
           {
               count++;
               break;
           }
       }
      if(count==0)
        System.out.print(i+" ");
       }
      }
    }

