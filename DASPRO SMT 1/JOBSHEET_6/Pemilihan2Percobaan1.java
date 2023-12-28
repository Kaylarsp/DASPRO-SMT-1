import java.util.Scanner;

/**
 * Pemilihan2Percobaan1
 */
public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int tahun;
        System.out.println("Masukkan tahun :");
        tahun = input15.nextInt();

        if ((tahun % 4) == 0) {
            System.out.println("Tahun kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println("Tahun kabisat");
        } else if (tahun % 400 == 0) {
            System.out.println("Tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}