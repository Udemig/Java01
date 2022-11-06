package Arabalar;

public class Surucu extends AbstractSinif implements Araba{


    @Override
    public int aracHacmi(int boy, int yukseklik) {
        return boy*yukseklik;
    }

    public void sinifIslemler(){
        aracKos();
        System.out.println("Surucu aracHacmi: "+ aracHacmi(2,3));
        System.out.println("Surucu aracMotorGucuHesaplama: "+ aracMotorGucuHesaplama(1200));

    }

    @Override
    public int aracMotorGucuHesaplama(int motorGucu) {
        return motorGucu / 2;
    }
}
