class main{
 public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   String a=s.nextLine();
   StringBuilder sb=new StringBuilder(a);
   if(sb.length()<=10000)
     System.out.println(sb.reverse());
   
 }
}
