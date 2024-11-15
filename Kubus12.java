import java.util.Scanner;
public class Kubus12{
     
    public static int hitungVolume (int sisi){
        int volume= sisi * sisi * sisi;
        return volume;
    }
    public static int hitungLuasPermukaanKubus (int a){
        int LuasPermukaanKubus = 6 * a;
        return LuasPermukaanKubus;
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        int sisi, LuasPermukaanKubus, volumeKubus;

        System.out.print("Masukkan sisi: ");
        sisi = input.nextInt();
    
        LuasPermukaanKubus = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus adalah " + LuasPermukaanKubus);

        volumeKubus = sisi * sisi * sisi;
        System.out.println("Volume Kubus adalah " + volumeKubus);
    }
}