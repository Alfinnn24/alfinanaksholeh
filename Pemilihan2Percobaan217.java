import java.util.Scanner;
public class Pemilihan2Percobaan217 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.println("Masukkan sudut 1");
        sudut1 = input17.nextFloat();
        System.out.println("Masukkan sudut 2");
        sudut2 = input17.nextFloat();
        System.out.println("Masukkan sudut 3");
        sudut3 = input17.nextFloat();
        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
             } else  if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60)){ 
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");                
             } else   if ((sudut1 == 40) || (sudut2 == 40) || (sudut3 == 40)){
                 System.out.println("Segitiga tersebut adalah segitiga sama kaki");
                 
             }else{
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
             }
            //  if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60)) {
            //     System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            //  }else{
            //     System.out.println("Segitiga tersebut adalah bukan segitiga sama sisi");
            //  }
            //  if ((sudut1 == 40) || (sudut2 == 40) || (sudut3 == 40)) {
            //     System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            //  }else{
            //     System.out.println("Segitiga tersebut adalah bukan sama kaki");
            //  }
        }else { 
            System.out.println("Bukan segitiga");
        }
    }
}

