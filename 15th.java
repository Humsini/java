class main{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in)
  int m=s.nextInt();
  int n=s.nextInt();
  for(int i=m+1;i<n;i++){
    if(i%2==0)
     System.out.print(i+" ");
  }
 }
}
