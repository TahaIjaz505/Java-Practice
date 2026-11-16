import java.util.Scanner;
public class day13 {
   public static void main(String[] args) {
    Scanner ta=new Scanner(System.in);
System.out.println("enter a number to check if it is palindrome!!");
int a=ta.nextInt();
int original=a;
int reverse=0;
int sum=0;
while(a!=0){
int ldigit=a%10;
sum+=ldigit;
reverse=reverse*10+ldigit;
a=a/10;
}
if (reverse==original) {
    System.out.println("it is palindrome number");
}else{
   System.out.println("it is not a palindrome number"); 
}
System.out.println("sum of digits= "+sum);
   } 
}
  