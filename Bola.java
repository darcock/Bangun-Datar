package BangunRuang;

public class Bola extends BangunRuang {
    double r;

    @Override
    double volume(){
        hasil = 4/3*Math.PI*r*r*r;
        System.out.println("Hasil Volume Bola : " + hasil);
        return hasil;
    }
    double LP (){
        hasil = 4*3.14*r*r;
        System.out.println("Hasil Luas Permukaan Bola : " + hasil);
        return hasil;
    }
}
