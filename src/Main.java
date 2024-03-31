import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,i=0,bolum=0,bolunecek=0;
        int ort;
        System.out.print("Bir sayi giriniz : ");
        sayi = inp.nextInt();
        for (i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                bolunecek = i + bolunecek;
                bolum++;
            System.out.println(i);
            }
        }
        ort = bolunecek / bolum;
        System.out.println("Sayıların ortalaması : "+ort);
    }
}