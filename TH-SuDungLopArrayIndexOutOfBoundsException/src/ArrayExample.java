import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    static Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] arr = creatRandom();
        System.out.println("nhap 1 so bat ky");
        int index = scanner.nextInt();
        try {
            System.out.println("vi tri" + index + "là " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("vuot qua mang");
        }

    }
}