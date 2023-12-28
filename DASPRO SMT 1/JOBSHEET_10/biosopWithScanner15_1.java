import java.util.Scanner;

public class biosopWithScanner15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("Enter menu : \n1. Input data penonton\n2. Tampilkan daftar penonton\n3. Exit");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("Input data penonton");
                System.out.print("Enter name : ");
                String name = sc.next();
                System.out.print("Enter row : ");
                int row = sc.nextInt();
                System.out.print("Enter column : ");
                int column = sc.nextInt();

                if (row >= 1 && row <=4 && column >= 1 && column <= 2) {
                    if (penonton[row-1][column-1] == null) {
                        penonton[row-1][column-1] = name;
                        System.out.println("Kursi tersedia\nData penonton telah terinput");
                        System.out.print("Kembali ke menu (y/n)? ");
                        String back = sc.next();
                        if (back.equalsIgnoreCase("y")) {
                            continue;
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Mohon maaf, kursi telah terisi");
                        System.out.println("Silahkan kembali ke pilihan menu");
                        continue;
                    }
                } else {
                    System.out.println("row dan column kursi tidak tersedia");
                }
                break;
            } else if (menu == 2) {
                System.out.println("Tampilkan daftar penonton");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Row " + ( i + 1)+ " Column " + (j + 1) + " : "+ penonton [i][j]);
                        } else {
                            System.out.println("Row " + ( i + 1)+ " Column " + (j + 1) + " : *** ");
                        }
                    }
                }System.out.print("Kembali ke menu (y/n) ? ");
                String back = sc.next();
                if (back.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            } else if (menu == 3) {
                System.out.println("Exit");
                System.out.print("Kembali ke menu (y/t) ? ");
                String back = sc.next();
                if (back.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            }
        }

        System.out.println("");
        System.out.println("===TERIMAKASIH TELAH MENGGUNAKAN LAYANAN BIOSKOP KAMI===");
    }
}
