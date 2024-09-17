package TugasP3.SoalNo2;

public class KonversiSuhu {

    public void celciusToFahrenheit(double celcius){
        double farhenheit = (celcius * 9/5) + 32;
        System.out.println(celcius + " C = " + farhenheit + " F");
    }

    public void celciusToReamur(double celcius){
        double reamur = (celcius * 4/5);
        System.out.println(celcius + " C = " + reamur + " R");
    }
}
