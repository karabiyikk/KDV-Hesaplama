import java.util.Scanner;
public class kdv {
        public static void main(String[] args) {
        double tutar, kdv, kdvli, kdvOran = 0.18, kdvOran2 = 0.08;
        Scanner para = new Scanner(System.in);

        System.out.print("KDV hesaplanacak tutarı girin: ");
        tutar = para.nextDouble();

        System.out.println("KDV'siz tutar : " + tutar);

        kdv = tutar < 1000 ? kdvOran : kdvOran2;
        System.out.println("KDV oranı : " + kdv);
        System.out.println("KDV miktarı : " + (tutar * kdv));

        kdvli = tutar +(tutar * kdv);
        System.out.print("KDV'li tutar : " + kdvli);
    }
}
