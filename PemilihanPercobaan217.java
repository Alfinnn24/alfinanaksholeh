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
        if (total >=0  && total <=100){
            if (total >=80 && total <=100){
                System.out.println("A");
            }else if (total >=73 && total <=80){
                    System.out.println("B+");
            }else if (total >=65 && total <=73){
                        System.out.println("B");
            }else if (total >=60 && total <=65){
                            System.out.println("C+");
            }else if (total >=50 && total <=60){
                                System.out.println("C");
            }else if (total >=39 && total <=50){
                                    System.out.println("D");
            }else {
                System.out.println("E");
                }
            }
        }
    }
            


