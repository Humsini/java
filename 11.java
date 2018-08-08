import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int pow=1;
        for(int i=1;i<=n;i++)
        {
             pow=pow*m;
        }
        System.out.println(pow);
    }
} 
