import java.util.Scanner;
public class UcapanTerimaKasih_12{
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();

        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world. \n" + "You inspired in me a love for learning and made me feel like i could ask you anything.");

        String ucapanTambahan = "I appreciate all your hard work and dedication!";
        ucapanTambahan(ucapanTambahan);
    }
    public static void ucapanTambahan(String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args){
        UcapanTerimaKasih();
    }
}