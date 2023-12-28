public class bubblesortexample15 {
    public static void main(String[] args) {

    int[] intData = { 34 , 18 , 87 , 72 , 32 , 54 , 43 };
    int temp = 0; //tempat sementara untuk pertukaran nilai antara elemen-elemen array ketika dilakukan sorting

    for (int i = 0; i < intData.length-1; i++) { //digunakan untuk mengatur iterasi di luar jika elemen terbesar telah dipindahkan ke posisi terakhir
        for (int j = 1; j < intData.length-i; j++) { //digunakan untuk membandingkan dan menukar elemen-elemen yang berdekatan jika elemen sebelumnya lebih besar dari elemen saat ini
            if (intData[j-1] < intData[j]) { //tanda ">" diganti menjadi "<" (descending) (untuk pengurutan menurun, operator > diubah menjadi <)
                //swap elemen
                //program memeriksa apakah intData[j-1] lebih kecil daripada intData[j].
                // Jika kondisi ini terpenuhi, maka elemen-elemen tersebut akan ditukar dengan menggunakan variabel temp.
                temp = intData[j];
                intData[j] = intData[j-1];
                intData[j-1] = temp;
            }
        }
    }
    System.out.println("Hasil pengurutan : "); //Hasil keluaran dari program ini adalah array intData diurutkan secara menurun (dari nilai tertinggi ke nilai terendah).
    for (int i = 0; i < intData.length; i++) {
        System.out.println(intData[i]);
    }

    }
}
