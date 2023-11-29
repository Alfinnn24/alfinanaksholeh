import java.util.Scanner;
public class PenjumlahanRekursif {
    static int bil;
    public static int PenjumlahanRekursif(int n) {
        if (n == bil) {
            return n;
        }else{
            return n + PenjumlahanRekursif(n+1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        bil = input.nextInt();
        System.out.println("Total: "+ PenjumlahanRekursif(1));
    }
}
