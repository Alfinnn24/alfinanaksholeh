import java.util.Scanner;
public class DeretDescendingRekursif {
    public static void TampilkanRekursif(int n) {
        System.out.println("Bilangan: "+n);

        if (n == 0) {
            return;
        }else{
            TampilkanRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int bil = input.nextInt();
        TampilkanRekursif(bil);
    }
}
