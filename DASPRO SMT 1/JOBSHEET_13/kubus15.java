import java.util.Scanner;

public class kubus15 {
    double sisi;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = sc.nextDouble();
        
        double volume = hitungVolume(sisiKubus);
        System.out.println("Volume kubus: " + volume);
        
        double luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
        sc.close();
    }
    static double hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }
    static double hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
}
