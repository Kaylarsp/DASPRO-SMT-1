public class terimakasih_15 {
    // fungsi 1
    public static void ucapanTerimakasih(){
        System.out.println("\nThank you for being the best teacher in the world. \n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    // fungsi 2
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        ucapanTerimakasih();
        String ucapan = "Terimakasih Pak.. Bu.. Semoga sehat selalu";
        UcapanTambahan(ucapan);
    }
}
