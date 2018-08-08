import java.util.*;
class Main{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int k=s.nextInt();
  int n[]=new int[a];
 for(int i=0;i<a;i++)
  {
      n[i]=s.nextInt();
  }
  int sum=0;
  for(int i=0;i<k;i++){
   sum=sum+n[i];
  }
  System.out.println(sum);
  }
} 
