import java.util.Scanner;

public class penjumlahanRekursif {

    static int hitung(int n) {
        if (n == 0) {
            return (0);
        } else {
            return n + (hitung(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(i + " + ");
        }

        int hasil = hitung(n);
        System.out.println(n + " = " + hasil);
    }
}