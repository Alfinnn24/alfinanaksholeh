import java.util.Scanner;
public class ForKelipatan16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0;
        double rataRata = 0;
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total +=i;
                counter++;
                rataRata = total/counter;
            }
        }
         System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
         System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
         System.out.printf("rataRata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}
