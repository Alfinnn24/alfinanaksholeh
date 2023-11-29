import java.util.Scanner;

public class BilanganPrimaRekursif {
    static int bil;
    public static int CekPrimaRekursif(int bilangan) {
        if (bilangan == 1) {
            return 1;
        }else if (bil % bilangan == 0) {
            return 0;
        }else {
            return CekPrimaRekursif(bilangan -1);
        }
    }
    public static boolean CekBilanganPrima(int angka) {
        if (angka > 1) {
            return (CekPrimaRekursif(angka - 1) == 1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        bil = input.nextInt();
        if (CekBilanganPrima(bil)) {
            System.out.print("BIlangan prima");
        }else{
            System.out.print("Bukan bilangan prima");
        }
    }
}
