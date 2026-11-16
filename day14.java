import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
     Scanner ta=new Scanner(System.in);   
 System.out.println("enter a number to find");
System.out.println("1.factorial & 2.armstrong quality");
int a=ta.nextInt();
long k=1;
for(int i=1;i<=a;i++){
k=k*i;
}
int original=a;
int csum=0;
while(a!=0){
int ldigit=a%10;
csum=(ldigit*ldigit*ldigit)+csum;
a=a/10;
}
System.out.println("factorial = "+k);
if (original==csum) {
    System.out.println("armstrong number!!");
}else{
 System.out.println("not a armstrong number!!");   
}
    }
}
