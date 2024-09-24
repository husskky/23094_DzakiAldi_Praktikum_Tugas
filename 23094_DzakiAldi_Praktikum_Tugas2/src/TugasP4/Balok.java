package TugasP4;

public class Balok {

    protected double panjang;
    private double lebar;
    private double tinggi;

    protected Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void Volume(){
        double vol = panjang * lebar * tinggi;
        System.out.println("Volume Balok            : " + vol);
    }

    public void LuasPermukaan(){
        double lp = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Permukaan Balok    : " + lp);
    }
    
} 
