import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nilai n : ");
        int n = sc.nextInt();

        System.out.println("\nMenggunakan perulangan for : \n");
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nMenggunakan perulangan while : ");
        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) { // pake (j < i) soalnya kalo pake (j < n) ntar jadinya persegi, bukan segitiga
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\nMenggunakan if, break : \n");
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                if (k == j) {
                    break;
                }
            }
            System.out.println();
        }

    }
}
