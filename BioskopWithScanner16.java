import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[][] {
                { "****", "****",
                        "****", "****" }
        };
        String nama, next;
        int baris, kolom;
        int menu;
        boolean keluar = true;
        while (keluar) {
            System.out.println("Menu :");
            System.out.println("1. input data penonton :");
            System.out.println("2. tampilkan daftar penonton :");
            System.out.println("3. exit");
            System.out.print("pilih menu :");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    if (baris > 0 && baris <= penonton.length && kolom > 0 &&
                            kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] != "****") {
                            System.out.println("kursi sudah di booking");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("kursi tersedia");
                            System.out.print("Input penonton lainnya? (y/n): ");
                            next = sc.next();
                        }
                    } else {
                        System.out.println("kursi tidak tersedia");
                    }
                    break;
                case 2:
                    System.out.println("daftar penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("penonton ke-" + (i + 1) + " : " +
                                String.join(",", penonton[i]));
                    }
                    break;
                case 3:
                    System.out.println("selesai");
                    keluar = false;
                default:
                    break;
            }
        }
    }
}