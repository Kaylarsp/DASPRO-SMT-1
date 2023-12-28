import java.util.Scanner;

public class segitigaAngka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nilai n : ");
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println("Nilai n minimal 3");
        } else {
            // perulangan untuk setiap baris, dari 1 dan akan bertambah satu setiap kali perulangan berjalan, sampai nilai i melebihi nilai n.
            // perulangan ini digunakan untuk mengatur jumlah baris yang akan dicetak.
            for (int i = 1; i <= n; i++) {
                // perulangan untuk mencetak spasi, dari 1 dan akan bertambah 1 setiap kali perulangan berjalan sampai nilai j <= n-i.
                // perulangan ini akan mengatur jumlah spasi yg akan dicetak sblm angka pd setiap baris.
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                // perulangan untuk mencetak angka, dari 1 dan akan bertambah 1 setiap kali perulangan berjalan, sampai nilai k <= i.
                // perulangan ini akan mengatur jml angka yg akan dicetak pd setiap baris, angka yg dicetak adlh angka urut dr 1 smp i.
                for (int k = 1; k <= i; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}