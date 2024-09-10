package SoalNo2;

public class Matematika implements InterfaceMatematika {
  
    @Override
    public void pertambahan(int a, int b){
        int jumlah = a + b;
        System.out.println(a + " + " + b + " = " + jumlah);
    }

    @Override
    public void pengurangan(int a, int b){
        int jumlah = a - b;
        System.out.println(a + " - " + b + " = " + jumlah);
    }

    @Override
    public void perkalian(int a, int b){
        int jumlah = a * b;
        System.out.println(a + " * " + b + " = " + jumlah);
    }

    @Override
    public void pembagian(int a, int b){
        int jumlah = a / b;
        System.out.println(a + " / " + b + " = " + jumlah);
    }
}


