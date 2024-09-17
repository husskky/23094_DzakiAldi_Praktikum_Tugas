package TugasP3.SoalNo2;

public class KonversiSuhu2 extends KonversiSuhu{
    
    public void farhenheitToReamur(double farhenheit){
        double reamur = (farhenheit - 32) * 4/9;
        System.out.println(farhenheit + " F = " + reamur + " R");
    }
}
