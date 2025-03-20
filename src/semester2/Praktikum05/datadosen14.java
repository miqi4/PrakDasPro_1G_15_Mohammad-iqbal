package semester2.Praktikum05;
public class datadosen14 {
    dosen14[] data=new dosen14[10];
    int idx;
    void tambah(dosen14 d){
        if (idx<data.length) {
            data[idx]=d;
            idx++;
        }else{System.out.println("data sudah penuh");}
    }
    void tampil(){
        for (dosen14 dosen : data) {
            dosen.tampilkan();
            System.out.println("===============================");
        }}
    void bubblesort(){
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 1; j < data.length-i; j++) {
                if (data[j].usia<data[j-1].usia) {
                    dosen14 tmp = data[j];
                    data[j]=data[j-1];
                    data[j-1]=tmp;
                }}}}
    void selectionSort(){
        for (int i = 0; i < data.length-1; i++) {
            int idxmin=i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j].usia>data[idxmin].usia) {
                    idxmin=j;}}
            dosen14 tmp = data[idxmin];
            data[idxmin]=data[i];
            data[i]=tmp;}}}