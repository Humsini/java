class humz{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int rem,sum=0;
    int temp=n;
    while(n>0){
      rem=n%10;
      sum=sum*10+rem;
      n=n/10;
     }
     if(temp==sum)
       System.out.println("Palindrome");
     else
        System.out.println("Not palindrome");
     
  }
}
