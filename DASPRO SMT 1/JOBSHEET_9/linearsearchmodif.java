import java.util.Scanner;

public class linearsearchmodif {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int result = 0;

        System.out.print("Masukkan jumlah elemen array : ");
        int size = sc.nextInt();

        arrayInt = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan elemen array ke- " + (i+1) + ": ");
            arrayInt [i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0 ;i < arrayInt.length ; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }

        System.out.println("Key ada di dalam array pada posisi indeks ke-" + result);
    }
}
