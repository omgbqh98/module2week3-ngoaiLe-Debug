import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input num1");
        int num1= scanner.nextInt();
        System.out.println("input num2");
        int num2 = scanner.nextInt();
        calculate(num1,num2);
    }

    static void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x * y = " + c);
            System.out.println("x / y = " + d);
        } catch (Exception e) {
            System.out.println("ngoai le ");
        }
    }
}
