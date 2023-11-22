import java.util.Scanner;

public class Kubus16 {
    static int vol, luasPermukaan;
    static int menghitungVolume(int s) {
        int Volume = 0;
        Volume = s*s;
        return Volume;
    }   
    static int menghitungLuasPermukaan(int s){
        int LP = 0;
        LP = 6 * s*s;
        return LP;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int sisi = input.nextInt();
        vol = menghitungVolume(sisi);
        System.out.println("Volume kubus adalah: "+ vol);
        luasPermukaan = menghitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah: "+ luasPermukaan);
    }
}
