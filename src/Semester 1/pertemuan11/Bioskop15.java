package pertemuan11;
public class Bioskop15 {
    public static void main(String[] args) {
        String[][] Penonton = new String[4][2];
        Penonton[0][0] = "amin";
        Penonton[0][1] = "bena";
        Penonton[1][0] = "candra";
        Penonton[1][1] = "dela";
        Penonton[2][0] = "eka";
        Penonton[2][1] = "farhan";
        Penonton[3][0] = "gisel";
        Penonton[3][1] = "hana";
        for (int i = 0; i < Penonton.length; i++) {
        System.out.println("penonton pada baris ke-"+(i+1)+" : "+String.join(" , ",Penonton[i]));
        }
    }
}
