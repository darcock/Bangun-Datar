package BangunRuang;

public class Balok extends BangunRuang {
    double p,l,t;

    @Override
    double volume (){
        hasil = p*l*t;
        System.out.println("Hasil Volume Balok: " + hasil);
        return hasil;
    }
    double LP(){
        hasil = 2*((p*l)+(l*t)+(p*t));
        System.out.println("Hasil Luas Permukaan Balok: " + hasil);
        return hasil;
    }

}
