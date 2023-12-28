import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1)); // x akan dikalikan x sebanyak y kali
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = sc.nextInt();
        int hasil = (hitungPangkat(bilangan, pangkat));

        System.out.print(bilangan); // percobaan 2, no 2
        for (int i = 1; i < pangkat; i++) {
            System.out.print(" x " + bilangan);
        }
        System.out.print(" x 1 = " + hasil);
    }
}
    // FURTHER EXPLANATION :

    // misalkan x = 2, y = 4
    // Panggilan Awal : hitungPangkat(2, 4)

    // Memeriksa kondisi dasar: y == 0? (tidak)
    // Kembali ke panggilan rekursif: return 2 * hitungPangkat(2, 3)
    // Panggilan Rekursif Pertama: hitungPangkat(2, 3)

    // Memeriksa kondisi dasar: y == 0? (tidak)
    // Kembali ke panggilan rekursif: return 2 * hitungPangkat(2, 2)
    // Panggilan Rekursif Kedua: hitungPangkat(2, 2)

    // Memeriksa kondisi dasar: y == 0? (tidak)
    // Kembali ke panggilan rekursif: return 2 * hitungPangkat(2, 1)
    // Panggilan Rekursif Ketiga: hitungPangkat(2, 1)

    // Memeriksa kondisi dasar: y == 0? (tidak)
    // Kembali ke panggilan rekursif: return 2 * hitungPangkat(2, 0)
    // Panggilan Rekursif Keempat: hitungPangkat(2, 0)

    // Memeriksa kondisi dasar: y == 0? (ya)
    // Mengembalikan nilai 1
    // Kemudian, hasilnya dihitung kembali:

    // return 2 * (2 * (2 * (2 * 1)))
    // return 2 * (2 * (2 * 2))
    // return 2 * (2 * 4)
    // return 2 * 8
    // return 16