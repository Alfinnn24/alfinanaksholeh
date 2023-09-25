import java.util.Scanner;
public class PemilihanPercobaan217 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = input17.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input17.nextFloat();
        System.out.print("NIlai kuis     : ");
        float kuis = input17.nextFloat();
        System.out.print("NIlai tugas     : ");
        float tugas = input17.nextFloat();
        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
