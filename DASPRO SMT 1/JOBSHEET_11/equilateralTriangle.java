import java.util.Scanner;

public class equilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();
        System.out.println();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            // Cetak segitiga sama sisi
            for (int i = 1; i <= N; i++) { // mengatur jumlah baris yg dicetak
                for (int j = N - i; j > 0; j--) { // mengatur jumlah spasi yg dicetak sblm bintang pd tiap baris
                    System.out.print(" ");
                }
                // Cetak bintang sebanyak i
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
