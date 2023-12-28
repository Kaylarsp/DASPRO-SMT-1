/**
 * percobaan1
 */
public class percobaan1 {

    static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursif(n - 1));
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }
}
    // FURTHER EXPLANATION :
    // 5 * hitungFaktorialRekursif(4)
    // 4 * hitungFaktorialRekursif(3)
    // 3 * hitungFaktorialRekursif(2)
    // 2 * hitungFaktorialRekursif(1)
    // return 1
    // return 2 * 1 = 2
    // return 3 * 2 = 6
    // return 4 * 6 = 24
    // return 5 * 24 = 120