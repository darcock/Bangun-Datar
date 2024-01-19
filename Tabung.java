package BangunRuang;

public class Tabung extends BangunRuang {
    double r,t;

    @Override
    double volume (){
        hasil = 3.14*r*r*t;
        System.out.println("Hasil Volume Tabung : " + hasil);
        return hasil;
    }
    double LP(){
        hasil = 2*3.14*r*(r+t);
        System.out.println("Hasil Luas Permukaan Tabung : " + hasil);
        return hasil;
    }
}
