package Arabalar;

public class BMW implements Ucaklar{
    @Override
    public void ucakGibiSur() {
        System.out.println("BMW ucak gibi calisiyor");
    }

    @Override
    public int kayitYili(int yas) {
        return 0;
    }

    public void aracPatinajYap(){
        System.out.println("Arac patinaj yapiyor");
    }
}
