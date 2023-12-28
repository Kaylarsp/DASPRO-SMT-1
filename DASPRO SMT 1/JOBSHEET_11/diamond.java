import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan nilai n: ");
        int n = input.nextInt();
        System.out.println();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3");
        } else {
            // Cetak bagian atas pola diamond
            for (int i = 1; i <= n; i++) {
                // Cetak spasi sebelum bintang
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
                // Cetak bintang sebanyak i
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                // Pindah ke baris berikutnya
                System.out.println();
            }

            // Cetak bagian bawah pola diamond
            for (int i = n - 1; i >= 1; i--) {
                // Cetak spasi sebelum bintang
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
                // Cetak bintang sebanyak i
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                // Pindah ke baris berikutnya
                System.out.println();
            }
        }
    }
}
