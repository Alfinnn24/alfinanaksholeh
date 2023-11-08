import java.util.Scanner;
public class NestedLoop_2341720024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < temps.length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temps + " ");
            }
            double total = 0;
            for (double temp : temps[i]) {
                total += temp;
            }
            double rataRata = total/temps[i].length;
            System.out.println("\nRata-rata kota ke-" + (i + 1) + ": " + rataRata);
            System.out.println();
        }
    }
}
