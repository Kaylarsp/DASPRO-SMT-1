import java.util.Scanner;

public class deretDescending {

    static void rekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            rekursif(n - 1);
        }
    }

    static void iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        System.out.println();

        System.out.print("Deret dengan fungsi rekursif : \n");
        rekursif(n);

        System.out.print("\nDeret dengan fungsi iteratif : \n");
        iteratif(n);
    }
}