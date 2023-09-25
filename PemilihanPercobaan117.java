import java.util.Scanner;
public class PemilihanPercobaan117 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input17.nextInt();
        String hasil; 
        hasil = (angka % 2 == 0)? "Bilangan genap" : "Bilangan ganjil"; 
        System.out.println("Angka "+angka+" Adalah "+hasil);
    }
}