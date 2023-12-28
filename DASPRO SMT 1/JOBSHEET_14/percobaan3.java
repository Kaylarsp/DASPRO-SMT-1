import java.util.Scanner;

public class percobaan3 {
    static double hitungLaba(int saldo, int tahun) {
        // base case :
        if (tahun == 0) {
            return (saldo); // jika investasi berlangsung selama 0 tahun, hasil akhirnya adalah saldo awal
        // recursion call :
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukkan jumlah saldo awal         : ");
        int saldo = sc.nextInt();
        System.out.print("Masukkan lamanya investasi (tahun) : ");
        int tahun = sc.nextInt();
        System.out.println("Jumlah saldo setelah " + tahun + " tahun       : " + hitungLaba(saldo, tahun));
    }
}

    // FURTHER EXPLANATION :
    // misal saldo = 1000, tahun = 3
    // hitungLaba(1000, 3)
    // 1.11 * hitungLaba(1000, 2)
    // 1.11 * 1.11 * hitungLaba(1000, 1)
    // 1.11 * 1.11 * 1.11 * hitungLaba(1000, 0)
    // 1.11 * 1.11 * 1.11 * 1000
    // hasil akhirnya merupakan jumlah saldo setelah 3 tahun