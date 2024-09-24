package TugasP4;

public class Kubus extends Balok {
    
    protected Kubus(double sisi){
        super(sisi, sisi, sisi);
    }

    @Override
    public void Volume(){
        double vol = panjang * panjang * panjang;
        System.out.println("Volume Kubus            : " + vol);
    }

    @Override
    public void LuasPermukaan(){
        double lp = 6 * (panjang * panjang);
        System.out.println("Luas Permukaan Kubus    : " + lp);
    }
    
}
