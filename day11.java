import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        System.out.println("enter 2 numbers and a operator to perform that operation!!");
        System.out.println(" ....+,*,-,/....");
        Scanner ta = new Scanner(System.in);
        int a = ta.nextInt();
        int b = ta.nextInt();
        ta.nextLine();
        String c = ta.nextLine();
        if (c.equals("+")) {
            System.out.println("sum = " + (a + b));
        } else if (c.equals("-")) {
            System.out.println("difference = " + (a - b));
        } else if (c.equals("*")) {
            System.out.println("product = " + (a * b));
        } else if (c.equals("/")) {
            if (b == 0) {
                System.out.println("math error");
            } else {
                System.out.println("divident = " + (a / b));
            }
        } else {
            System.out.println("invalid operator");
        }
    }
}