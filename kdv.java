package Baslangic;
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double tutar, kdv, kdvli, kdvOran = 0.18;
        Scanner para = new Scanner(System.in);

        System.out.print("KDV hesaplanacak tutarı girin: ");
        tutar = para.nextDouble();
        System.out.println("KDV'siz tutar : "+ tutar);

        kdv = tutar * kdvOran;
        System.out.println("KDV tutarı : " + kdv);

        kdvli = tutar + kdv;
        System.out.print("KDV'li tutar : " + kdvli);
    }
}
