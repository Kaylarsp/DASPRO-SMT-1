import java.util.Scanner;

public class assignment1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int size = sc.nextInt(); //digunakan untuk menentukan ukuran array 'arrayInt'.
        int[] arrayInt = new int[size]; //deklarasi dan inisialisasi array yang akan ditentukan oleh pengguna

        //meminta pengguna memasukkan nilai untuk setiap elemen array :
        for (int i = 0; i < size; i++) { //berjalan sebanyak size kali, nilainya disimpan di dalam array 'arrayInt'.
            System.out.print("Masukkan elemen array ke-" + (i + 1) + " : ");
            arrayInt[i] = sc.nextInt();
        }

        int max = arrayInt[0];
        int min = arrayInt[0];
        double sum = 0; //Variabel sum diinisialisasi dengan 0 untuk menghitung total nilai elemen array.

        //mencari nilai maksimum, minimum, dan menghitung total elemen array:
        for (int i = 0; i < size; i++) {
            if (arrayInt[i] > max) { //membandingkan setiap elemen array dengan max dan min untuk menentukan nilai tertinggi dan terendah.
                max = arrayInt[i]; //Jika elemen array saat ini lebih besar dari max, maka max diperbarui.
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i]; //Jika elemen array saat ini lebih kecil dari min, maka min diperbarui.
            }
            sum += arrayInt[i]; //menambahkan nilai elemen array ke dalam sum untuk menghitung total.
        }

        double avg = sum / size;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + avg);

    }
}
