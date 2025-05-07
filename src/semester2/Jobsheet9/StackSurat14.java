package semester2.Jobsheet9;
public class StackSurat14 {
    Surat14[]stack;
    int top;
    int size;
    public StackSurat14(int size){
        this.size=size;
        stack= new Surat14[size];
        top=-1;
    }
    public boolean Isfull(){
        if (top==size-1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean IsEmpty(){
        if (top==-1) {
            return true;
        }else{
            return false;
        }
    }
    public void push(Surat14 mhs){
        if (!Isfull()) {
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! tidak bisa menambahkan surat lagi");}
    }
    public Surat14 pop(){
        if (!IsEmpty()) {
            Surat14 s = stack[top];
            top--;
            return s;
        }else{
            System.out.println("Stack kosong! tidak ada surat untuk dinilai");
            return null;}
    }
    public Surat14 peek(){
        if (!IsEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong ! tidak ada surat yang dikumpulkan");
            return null;}
    }
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].NamaMhs.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("Nama: " + stack[i].NamaMhs);
                System.out.println("Kelas: " + stack[i].Kelas);
                System.out.println("Jenis Izin: " + stack[i].JenisIzin);
                System.out.println("Durasi: " + stack[i].durasi+ " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama \"" + nama + "\" tidak ditemukan.");}}}
