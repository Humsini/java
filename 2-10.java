import java.util.*;
public class MyClass{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
   String b=sc.nextLine();
   int count=0;
   if(a.length()<=100000 && b.length()<=100000){
   for(int i=0;i<a.length();i++)
   {
       if(a.charAt(i)==b.charAt(i))
       count++;
   }
   if(count==a.length()-1)
    System.out.println("yes");
   else
    System.out.println("no");
    }
   }
}
