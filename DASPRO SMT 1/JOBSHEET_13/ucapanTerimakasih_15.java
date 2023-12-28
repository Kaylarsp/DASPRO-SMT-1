import java.util.Scanner;

public class ucapanTerimakasih_15 {
    public static String penerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTuliskan nama penerima ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void ucapanTerimakasih(){
        String nama = penerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world. \n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void main(String[] args) {
        ucapanTerimakasih();
    }
}
