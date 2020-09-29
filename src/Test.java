public class Test {
    public static void main(String[] args) {
        int arr[] = {1,2};

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("ok");
        }

    }
}
