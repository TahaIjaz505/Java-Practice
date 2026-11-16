import java.util.Scanner;
public class day12 {
  public static void main(String[] args) {
  Scanner ta=new Scanner(System.in);  
System.out.println("enter a number ");
int a=ta.nextInt();
int sum=0;
for(int i=1;i<=a;i++){
    int k=0;
for(int j=1;j<=i;j++){
if(i%j==0){
  k++;  
}
}
if(k==2){
    System.out.println(i);
    sum+=i;
}
  } 
  System.out.println("sum of prime numbers= "+sum); 
}
}