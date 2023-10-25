import java.util.Scanner;
public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double total1 = 10, total2 = 0;
        double rataLulus, rataTdkLulus;
        int counter1 = 0, counter2;
        int Jml;
        System.out.print("Masukkan jumlah mahasiswa : ");
        Jml = sc.nextInt();
        int[] nilaiMhs = new int[Jml];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
           
            }
             for (int i = 0; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > 70) {
                    total1 += nilaiMhs[i];
                    counter1++;
                } else {
                    total2 += nilaiMhs[i];
                }
        }
        counter2 = nilaiMhs.length - counter1;
        rataLulus = total1 / counter1;
        rataTdkLulus = total2 / counter2;

        System.out.println("Jumlah mahasiswa yang lulus = " + counter1);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + counter2);
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + nilaiMhs);
    }
}
