import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)

        int n,r;
        int total1 = 1, total2 = 1, minus = 1;
        double c;

        Scanner faktoriyel = new Scanner(System.in);
        System.out.println("İlk Kümenin Eleman Sayısını Giriniz : ");
        n = faktoriyel.nextInt();

        for (int i =1; i <= n; i++){
            total1 = total1 * i;

        }
        System.out.println("Oluşturulacak Kümenin Eleman Sayısını Giriniz : ");
        r = faktoriyel.nextInt();
        for (int i = 1; i <= r; i++){
            total2 = total2 * i;

        }for (int i = 1; i <= (n-r); i++){
            minus = minus * i;
        } c = total1/(total2 * minus);
        System.out.println( " C(n,r)" + c);
    }
}