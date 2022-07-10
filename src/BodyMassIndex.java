import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double boy, kilo, bki;
        boolean deger;
        String sonuc;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Boyunuzu Metre Cinsinde Giriniz: ");
        boy = girdi.nextDouble();
        System.out.print("Kilonuzu Kilogram Cinsinde Giriniz: ");
        kilo = girdi.nextDouble();
        bki = kilo / (boy * boy);
        System.out.println("Vucut Kitle Endeksiniz: "+ bki);
        deger = (0 < bki) && (18.5 >= bki);
        sonuc = deger ? "Dusuk Kilolusun" : "";
        System.out.print(sonuc);

        deger =  (18.5 < bki) && (25 >= bki);
        sonuc = deger ? "Normal Kilolusun" : "";
        System.out.print(sonuc);

        deger = (25 < bki) && (30 >= bki);
        sonuc = deger ? "Fazla Kilolusun" : "";
        System.out.print(sonuc);

        deger = (30 < bki) && (40 >= bki);
        sonuc = deger ? "Obezsin" : "";
        System.out.print(sonuc);

        deger = (40 < bki);
        sonuc = deger ? "Asiri Obezsin" : "" ;
        System.out.print(sonuc);

    }
}
