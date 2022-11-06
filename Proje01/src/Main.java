import Arabalar.*;
import Kedigiller1.DoguKedisi;
import Kedigiller1.VanKedisi;
import Kedigiller2.BatiKedisi;
import Poli.Aslan;
import Poli.Hayvanlar;
import Poli.Hesaplama;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");

        DoguKedisi doguKedi = new DoguKedisi();
        System.out.println("kediRenk " + doguKedi.kediRenk);

        VanKedisi vanKedi = new VanKedisi();
        vanKedi.doguluKediyiGor();

        BatiKedisi batiKedi = new BatiKedisi();
        batiKedi.kediDurumlari();

        Surucu surucu = new Surucu();
        surucu.sinifIslemler();


        //Poli - type casting
        Ucaklar ucak;
        ucak = new BMW();
        ucak.ucakGibiSur();

        ucak = new Mercedes();
        ucak.ucakGibiSur();

        //Poli - Overloading
        Hesaplama hesap = new Hesaplama();
        System.out.println("tek : "+ hesap.topla(3));
        System.out.println("tek : "+ hesap.topla(3,4));

        //Poli - type casting
        int fiyat = 10;
        float fiyatFloat = 15.7f;

        float anlikFiyat = (fiyat + fiyatFloat) / 2;
        System.out.println("anlikFiyat : "+ anlikFiyat);


        Object obje = new Aslan();
        System.out.println("hashCode " + obje.hashCode());

        Hayvanlar hayvan = (Hayvanlar) obje;
        hayvan.hayvanBeslen();

        Aslan aslan = (Aslan) obje;
        aslan.kukre();
         */

        try {
            int deger = 1 / 0;
        } catch (Exception e){
            System.out.println("Hata: " + e);
        } finally {
            System.out.println("Finally calistir");
        }


    }

}