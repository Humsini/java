class main{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in)
  int n=s.nextInt();
  int q=s.nextInt();
  if(n<=100000 && q<=100000){
   for(i=n+1;i<q;i++){
    if(i%2!=0)
     System.outr.println(i+" ");
   }
  }
 }
}
