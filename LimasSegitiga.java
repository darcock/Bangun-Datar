package BangunRuang;

public class LimasSegitiga extends BangunRuang {
    double luasAlas, t, luasSelubung;

    @Override
    double volume (){
        hasil = 1*luasAlas*t/3;
        System.out.println("Hasil Volume Prisma : " + hasil);
        return hasil;
    }
    double LP(){
        hasil = luasAlas + luasSelubung;
        System.out.println("Hasil Luas Permukaan Prisma : " + hasil);
        return hasil;
    }
}
