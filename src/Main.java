import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, fiz, tur, kim, muz;
        double ort;
        int dersSayisi = 0;
        int toplamNot = 0;

        System.out.println("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        if (mat > 100 || mat < 0) {
            System.out.println("Geçersiz bir not puanı girdiniz. Not ortalamaya eklenmedi.");
        }else{
            dersSayisi++;
            toplamNot += mat;
        }
        System.out.println("Fizik notunuzu giriniz:");
        fiz = inp.nextInt();
        if (fiz > 100 || fiz < 0) {
            System.out.println("Geçersiz bir not puanı girdiniz. Not ortalamaya eklenmedi.");
        }else{
            dersSayisi++;
            toplamNot += fiz;
        }
        System.out.println("Türkçe notunuzu giriniz:");
        tur = inp.nextInt();
        if (tur > 100 || tur < 0) {
            System.out.println("Geçersiz bir not puanı girdiniz. Not ortalamaya eklenmedi.");
        }else{
            dersSayisi++;
            toplamNot += tur;
        }
        System.out.println("Kimya notunuzu giriniz:");
        kim = inp.nextInt();
        if (kim > 100 || kim < 0) {
            System.out.println("Geçersiz bir not puanı girdiniz. Not ortalamaya eklenmedi.");
        }else{
            dersSayisi++;
            toplamNot += kim;
        }
        System.out.println("Müzik notunuzu giriniz:");
        muz = inp.nextInt();
        if (muz > 100 || muz < 0) {
            System.out.println("Geçersiz bir not puanı girdiniz. Not ortalamaya eklenmedi.");
        }else{
            dersSayisi++;
            toplamNot += muz;
        }
        ort = (double) toplamNot / (double) dersSayisi;
        System.out.println("Not Ortalaması: " + ort);
        if (ort <= 50){
            System.out.println("Kaldınız");
        }else{
            System.out.println("Geçtiniz!");
        }

    }
}