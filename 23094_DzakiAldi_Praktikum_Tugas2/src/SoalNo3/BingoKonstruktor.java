package SoalNo3;

public class BingoKonstruktor {
    String[] letters =  {"B", "I", "N", "G", "O"};
    public BingoKonstruktor(){
        lagu();
    }

    void lagu(){
        for (int i = 0; i <= letters.length; i++) {
            lineLagu(i);
        }
    }


    void lineLagu(int jumlahTepuk) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for (int j = 0; j < 3; j++) {
            lineTepuk(jumlahTepuk);
        }
        System.out.println("And Bingo was his name-o.\n");
    }

    void lineTepuk(int jumlahTepuk){
        StringBuilder line = new StringBuilder();
        for (int k = 0; k < jumlahTepuk; k++) {
            line.append("(clap)-");
        }
        for (int l = jumlahTepuk; l < letters.length; l++) {
            line.append(letters[l]).append("-");
        }
        line.deleteCharAt(line.length() - 1); 
        System.out.println(line.toString());
    }
}
