import java.util.*;
public class MyClass{
 public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int fact=1;
   if(n<20){
       for(int i=1;i<=n;i++){
           fact=fact*i;
       }
       System.out.println(fact);
    }
  }
}
