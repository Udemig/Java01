package Kedigiller1;

import Kedigiller2.AtaKedi;

public class VanKedisi extends AtaKedi {

    public void doguluKediyiGor(){
        DoguKedisi doguKedisi = new DoguKedisi();
        System.out.println("kedi ayak sayisi: " + doguKedisi.kediAyakSayisi);
        System.out.println("kedi adi " + doguKedisi.getKediAdi());
        doguKedisi.setKediAdi("dogulu1");
        System.out.println("kedi adi " + doguKedisi.getKediAdi());

        System.out.println("-- --- - - -- - -- - -- - -- - ");
        zipla();
        miyavla();
        ziplama();


        System.out.println("kedi adi " + kediUzunlugu());

        System.out.println("-- --- - - -- - -- - -- - -- - ");
    }

    public void miyavla(){ //Override
        super.miyavla();
        System.out.println("Kedi miyavlamiyor");
    }

    void ziplama(){
        super.zipla();
        System.out.println("Kedi ziplamiyor");
    }
}
