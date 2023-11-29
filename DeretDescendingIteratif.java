import java.util.Scanner;

public class DeretDescendingIteratif {
    static int bil;

    public static void TampilkanIteratif(int n) {
        for (int i = bil; i >= 0; i--) {
            System.out.println("Bilangan: " + i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        bil = input.nextInt();
        TampilkanIteratif(bil);
    }
}
