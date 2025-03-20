package semester2.Praktikum05;
import java.util.Scanner;
public class mahasiswaBerprestasi14 {
    mahasiswa14[]listmhs=new mahasiswa14[5];
    int idx;
    Scanner input = new Scanner(System.in);
    void tambah(mahasiswa14 m){
        if (idx<listmhs.length) {
            listmhs[idx]=m;
            System.out.print("masukkan NIM : ");
            m.NIM = input.nextLine();
            System.out.print("masukkan Nama : ");
            m.nama = input.nextLine();
            System.out.print("masukkan kelas : ");
            m.kelas = input.nextLine();
            System.out.print("masukkan IPK : ");
            m.ipk = input.nextDouble();
            System.out.println("==================================");
            idx++;
            input.nextLine();
        }else{System.out.println("data sudah penuh");}}
    void tampil(){
        for (mahasiswa14 m : listmhs) {
            m.tampilinformasi();
            System.out.println("=======================================");
        }}
    void bubblesort(){
        for (int i = 0; i < listmhs.length-1; i++) {
            for (int j = 1; j < listmhs.length-i; j++) {
                if (listmhs[j].ipk>listmhs[j-1].ipk) {
                    mahasiswa14 tmp = listmhs[j];
                    listmhs[j]=listmhs[j-1];
                    listmhs[j-1]=tmp;
                }}}}
    void selectionSort(){
        for (int i = 0; i < listmhs.length-1; i++) {
            int idxmin=i;
            for (int j = i+1; j < listmhs.length; j++) {
                if (listmhs[j].ipk<listmhs[idxmin].ipk) {
                    idxmin=j;
                }
            }
            mahasiswa14 tmp = listmhs[idxmin];
            listmhs[idxmin]=listmhs[i];
            listmhs[i]=tmp;
        }
    }
    void insertionsort(){
        for (int i = 1; i < listmhs.length; i++) {
            mahasiswa14 temp = listmhs[i];
            int j=i;
            while (j>0&&listmhs[j-1].ipk>temp.ipk) {
                listmhs[j]=listmhs[j-1];
                j--;
            }
            listmhs[j]=temp;
        }
    }
}
