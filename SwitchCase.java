package switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int s1, s2, secim;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        s1 = input.nextInt();
        System.out.print("2:sayıyı Giriniz : ");
        s2 = input.nextInt();

        System.out.println("1- Toplama \n 2- Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.println("Seçiminiz : ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Cevap: " + (s1 + s2));
                break;
            case 2:
                System.out.println("Cevap: " + (s1 - s2));
                break;
            case 3:
                System.out.println("Cevap: " + (s1 * s2));
                break;
            case 4:
                if (s2 != 0) {
                    System.out.println("Cevap: " + (s1 / s2));
                } else {
                    System.out.println("'. Sayı 0 dan farklı olmalıdır");
                }
                break;
        }
    }
}
