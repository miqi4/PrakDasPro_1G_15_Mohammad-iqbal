package semester2.minggu5;
public class Faktorial14 { 
    int FaktorialBF(int n){
        int faktor = 1;
        int i = 1;
        while (i <= n) {
            faktor *= i;
            i++;
    }
    return faktor;
    }
    int FaktorialDC(int n){
        if (n == 1) {
            return 1;
        }else{
            int faktor = n*FaktorialDC(n-1);
            return faktor;
        }
    }
}