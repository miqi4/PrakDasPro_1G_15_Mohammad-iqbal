package semester2.Jobsheet10;
public class Antrianlayanan14 {
    mahasiswa14[]data;
    int front,rear,size,max;
    public Antrianlayanan14(int max){
        this.max=max;
        this.data=new mahasiswa14[max];
        this.front=0;
        this.rear=-1;
        this.size=0;
    }
    public boolean IsEmpty(){
        if (size==0) {
            return true;
        }else{
            return false;
        }
    } 
    public boolean Isfull(){
        if (size==max) {
            return true;
        }else{
            return false;
        }
    }
    public void tambahAntrian(mahasiswa14 mhs) {
        if (Isfull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    
    public mahasiswa14 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        mahasiswa14 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkandata();
        }
    }
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkandata();
        }
    } 
    public int getjumlahantrian(){
        return size;
    }
    public void Lihatakhir(){
            if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkandata();
            }
    }
}
