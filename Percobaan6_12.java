import java.util.Scanner;
public class Percobaan6_12{

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = p * l * t;
        System.out.println("Volume Balok adalah " + vol);
    }
    public static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }
    public static int hitungVolume (int tinggi, int a, int b){
        int volume= hitungLuas(a, b) * tinggi;
        return volume;
    }
}