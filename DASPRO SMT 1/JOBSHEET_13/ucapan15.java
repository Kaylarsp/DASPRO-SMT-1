import java.util.Scanner;

public class ucapan15 {
    // Mengubah tipe data fungsi PenerimaUcapan() menjadi void
    public static void PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTuliskan nama penerima ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        // Statement yang ditambahkan
        System.out.println("Fungsi ini berhasil dijalankan.");
        // Mencetak ucapan terima kasih kepada nama yang diinput
        System.out.println("Thank you " + namaOrang + ", May the force be with you.");
        // Menghapus perintah return
    }
    public static void main(String[] args) {
        // Memanggil fungsi PenerimaUcapan() tanpa dilewatkan ke variabel
        PenerimaUcapan();
    }
}
