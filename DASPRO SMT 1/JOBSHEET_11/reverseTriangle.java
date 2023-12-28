import java.util.Scanner;

public class reverseTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nilai n : ");
        int n = sc.nextInt();
        System.out.println();
        if (n < 5) {
            System.out.println("Nilai n minimal 5"); // mencetak teks "Nilai N minimal 5" di layar
        } else {
            for (int i = n; i >= 1; i--) { // perulangan untuk setiap baris, dari N sampai 1
                for (int j = 1; j <= i; j++) { // perulangan untuk mencetak bintang, dari 1 sampai i
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nMenggunakan break : \n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                    if ((i + j) == (n-1)) {
                        break;
                    }
                }
                System.out.println();
            }
        }
    }
}
