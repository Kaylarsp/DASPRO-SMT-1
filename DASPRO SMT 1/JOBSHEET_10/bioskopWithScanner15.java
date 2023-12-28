import java.util.Scanner;

public class bioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column;
        String name, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Enter name : ");
            name = sc.next();
            System.out.print("Enter row : ");
            row = sc.nextInt();
            System.out.print("Enter column : ");
            column = sc.nextInt();

            penonton[row-1][column-1] = name;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = sc.next();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
