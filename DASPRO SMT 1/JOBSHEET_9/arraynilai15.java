import java.util.Scanner;

public class arraynilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] finalscore = new int[10];

        for (int i = 0; i < finalscore.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            finalscore[i] = sc.nextInt();
        }

        for (int i = 0; i < finalscore.length; i++) {
            if (finalscore[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus! ");
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus! ");
            }
        }
    }
}
