import java.util.Scanner;

public class nestedLoop_2341760103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // mendeklarasikan array 2D
        double[][] temps = new double[5][7];
        // mengisi data suhu, diulang sebanyak 5 kali (pnjg array)
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Hari ke-" + (j + 1) + ": ");
            temps[i][j] = sc.nextDouble();
            }
            System.out.println();
            }
        // for (int i = 0; i < temps.length; i++) {
        //     System.out.print("Kota ke-" + (i + 1) + ": ");
        //     for (int j = 0; j < temps[0].length; j++) {
        //     System.out.print(temps[i][j] + " ");
        //     }
        //     System.out.println();
        //     }

        // menampilkan data suhu, menggunakan perulangan foreach
        int kota = 1; // variabel untuk menyimpan nomor kota
        for (double[] baris : temps) { // perulangan untuk setiap baris array 2 dimensi
            System.out.print("Kota ke-" + kota + ": ");
            double total = 0; // variabel untuk menyimpan total suhu per kota
            for (double suhu : baris) { // perulangan untuk setiap elemen dalam baris array 2 dimensi
            System.out.print(suhu + " ");
            total += suhu; // menambahkan suhu ke total
            }
            double rata = total / baris.length; // variabel untuk menyimpan nilai rata-rata per kota
            System.out.println();
            System.out.println("Nilai rata-rata kota ke-" + kota + " adalah: " + rata); // menampilkan nilai rata-rata per kota
            kota++; // menambahkan nomor kota setiap kali perulangan baris selesai
        }
    }
}
