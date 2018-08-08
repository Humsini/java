import java.util.*;
class main{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  char c=s.next().charAt(0);
  if((c>='a' && c<='z') || (c>='A' && c<='Z')){
  if(c=='a'|| c=='A'|| c=='e'||c=='o'||c=='i'||c=='u'||c=='E'||c=='O'||c=='I'||c=='U')
   system.out.println("Vowel");
  else
   System.out.println("Consonant");
   }
   else
    System.out.println("invalid");
 }
} 
