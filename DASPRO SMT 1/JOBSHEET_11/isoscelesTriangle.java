import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nilai n (lebih baik ganjil) : ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j) == (n - 1)) {
                    break;
                }
            }
            System.out.println();
        }

    }
}
