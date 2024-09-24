package TugasP4;

public class BangunRuangAksi {

    public static void main(String[] args) {
        Balok b = new Balok(10, 5, 3);
        b.Volume();
        b.LuasPermukaan();

        Kubus k = new Kubus(10);
        k.Volume();
        k.LuasPermukaan();
    }
}
