import java.util.Scanner;

public class arrayavgscore15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        int count1 = 0, count2 = 0;
        double total1 = 0, total2 = 0;
        double avg1, avg2;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] > 70) {
                total1 += nilaiMhs[i];
                count1++;
            } else {
                total2 += nilaiMhs[i];
                count2++;
            }
        }
        avg1 = total1 / count1;
        System.out.println("Rata-rata nilai lulus : " + avg1);
        avg2 = total2 / count2;
        System.out.println("Rata- rata nilai tidak lulus : " + avg2);
    }
}
