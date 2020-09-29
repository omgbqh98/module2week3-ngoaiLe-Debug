import java.util.EmptyStackException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canh1 , canh2, canh3;

        try {
            System.out.println("input canh 1");
            canh1 = scanner.nextInt();
            System.out.println("input canh 2");
            canh2 = scanner.nextInt();
            System.out.println("input canh 3");
            canh3 = scanner.nextInt();

            if (canh1 > 0 && canh2 > 0 && canh3 > 0 && canh1 + canh2 > canh3 && canh1 + canh3 > canh2) {
                System.out.println("c1= " + canh1 + ", c2= " + canh2 + ", c3= " + canh3);
            } else {
                throw new EmptyStackException();
            }

        } catch (Exception e) {
            System.out.println("loi rooooi");
        }
                }
        }