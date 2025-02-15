package pertemuan13;
import java.util.Scanner;
public class P13_Tugas1 {
    static int hitungvolume(int t,int l,int p){
        int volume=p*t*l;
        return volume;
    }
    static int hitungluasp(int l){
        int luasp=6*l*l;
        return luasp;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int p,l,t,luasp, vol;
        System.out.print("Masukkan panjang = ");
        p=input.nextInt();
        System.out.print("Masukkan lebar = ");
        l=input.nextInt();
        System.out.print("Masukkan tinggi = ");
        t=input.nextInt();
        vol=hitungvolume (t,p,l);
        System.out.println ("Volume Balok adalah "+vol);
        luasp=hitungluasp(l);
        System.out.println("luas permukaan adalah "+luasp);
        }
}
