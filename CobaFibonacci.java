import java.util.Scanner;
public class CobaFibonacci {
    
    public static int DeretFibonacci(int f) {
        if (f == 0 || f == 1) {
            return f;
        }else{
            return (DeretFibonacci(f-1)+DeretFibonacci(f-2));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
        int fibonacci = input.nextInt();
        for (int i = 1; i <= fibonacci; i++) {
            System.out.printf("Bulan ke - %d: %d pasangan",i,DeretFibonacci(i));
            System.out.println();
        }
    }
}
