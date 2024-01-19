package BangunRuang;

public class Main {
    public static void main(String[] args) {
        BangunRuang bangun_ruang = new BangunRuang();

        Balok balok = new Balok();
        balok.p = 5;
        balok.l = 5;
        balok.t = 2;
        balok.volume();
        balok.LP();
        System.out.println();

        Tabung tabungs = new Tabung();
        tabungs.r = 7;
        tabungs.t = 10;
        tabungs.volume();
        tabungs.LP();
        System.out.println();

        Bola ball = new Bola();
        ball.r = 7;
        ball.volume();
        ball.LP();   
        System.out.println();

        LimasSegitiga lim3 = new LimasSegitiga();
        lim3.luasAlas = 10;
        lim3.luasSelubung = 12;
        lim3.t = 6;
        lim3.volume();
        lim3.LP();
        System.out.println();

    }
}
