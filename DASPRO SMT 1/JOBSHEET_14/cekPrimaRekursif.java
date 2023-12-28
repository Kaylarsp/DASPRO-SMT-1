import java.util.Scanner;

public class cekPrimaRekursif {
    
    static String prima(int n, int i) {
        if (i == n) {
            return " bilangan";
        } else {
            if (n % i == 0) {
                return " bukan bilangan";
            }
            return prima(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan bilangan : ");
        int n = sc.nextInt();

        String hasil = prima(n, 2);

        System.out.println(n + hasil + " prima ");
    }
}
