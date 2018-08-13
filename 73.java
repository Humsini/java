import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sh=s.nextLine();
        int count=0;
        for(int i=0;i<sh.length();i++)
        {
            if(sh.charAt(i)=='a'||sh.charAt(i)=='e'||sh.charAt(i)=='i'||sh.charAt(i)=='o'|| sh.charAt(i)=='u')
        {
        count++;
          System.out.println("yes");
          break;
        }
        
        }
        if(count==0)
        {
            System.out.println("no");
        }
    }
}
