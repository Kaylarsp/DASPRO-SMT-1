import java.util.Scanner;
import java.util.Random;
public class quiz {
    public static void main(String[] args) {
        Random random = new Random(); // menghasilkan angka secara acak
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            // menyimpan angka acak yang dihasilkan oleh objek random
            int number = random.nextInt(10) + 1;
            // menyimpan status apakah pengguna berhasil menebak angka atau tidak
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                // mencegah terjadinya error saat membaca input selanjutnya
                input.nextLine(); // ignore the new line character
                // mengubah nilai dr var. success sesuai dg hasil perbandingan antara var. answer & number
                // Jika keduanya sama, maka success akan bernilai true, berarti pengguna berhasil menebak angka
                // Jika keduanya beda, maka success akan bernilai false, berarti pengguna blm berhasil menebak angka
                success = (answer == number);
                // menambahkan perintah untuk menampilkan informasi mengenai input nilai tebakan
                if (!success) { // jika pengguna belum berhasil menebak angka
                    if (answer < number) { // jika tebakan pengguna lebih kecil dari jawaban
                        System.out.println("Tebakan Anda terlalu kecil");
                    } else { // jika tebakan pengguna lebih besar dari jawaban
                        System.out.println("Tebakan Anda terlalu besar");
                    }
                } else { // jika pengguna berhasil menebak angka
                    System.out.println("Selamat, Anda berhasil menebak angka!");
                }
            } while (!success); // perulangan akan berlangsung slama nilai success adlh false, kalo true dia bakal berhenti
            System.out.print("Apakah anda ingin mengulangi permainan? (Y/y) ");
            // mengubah nilai dr var. menu sesuai dg karakter pertama yg diinput pengguna
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y'); // perulangan akan berlangsung selama nilai menu adlh y atau Y, kalo bukan dia bakal berhenti
    }
}
