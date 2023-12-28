import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int sudut1, sudut2, sudut3, totalSudut;
        String jenis;
        
        System.out.println("Masukkan sudut 1 :");
        sudut1 = input15.nextInt();
        System.out.println("Masukkan sudut 2 :");
        sudut2 = input15.nextInt();
        System.out.println("Masukkan sudut 3 :");
        sudut3 = input15.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                jenis = "segitiga siku-siku";
            } else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                jenis = "segitiga sama sisi";
            } else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1)) {
                jenis = "segitiga sama kaki";
            } else {
                jenis = "segitiga sembarang";
            }
            System.out.println("Jenis segitiga tersebut adalah " + jenis);
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}
