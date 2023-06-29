import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("This program allows you to add two numbers");
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        sum(a,b);
    }

    static void sum(int a, int b){
        int result = a + b;
        System.out.println("The sum of the two numbers is: " + result);
    }
}