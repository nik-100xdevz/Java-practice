import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Biggest number is: " + a);
        } 
        else if (b > a && b > c) {
            System.out.println("Biggest number is: " + b);
        } 
        else {
            System.out.println("Biggest number is: " + c);
        }
    }
}