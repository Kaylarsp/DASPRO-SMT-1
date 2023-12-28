import java.util.Scanner;

public class linearsearch15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int result = 0;

        for (int i = 0 ;i < arrayInt.length ; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }

        System.out.println("Key ada di dalam array pada posisi indeks ke-" + result);
    }
}
