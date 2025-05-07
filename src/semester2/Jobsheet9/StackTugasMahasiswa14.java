package semester2.Jobsheet9;
public class StackTugasMahasiswa14 {
    Mahasiswa14[] stack;
    int top;
    int size;
    public StackTugasMahasiswa14(int size){
        this.size=size;
        stack= new Mahasiswa14[size];
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
    public void push(Mahasiswa14 mhs){
        if (!Isfull()) {
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! tidak bisa menambahkan tugas lagi");}
    }
    public Mahasiswa14 pop(){
        if (!IsEmpty()) {
            Mahasiswa14 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai");
            return null;}
    }
    public Mahasiswa14 peek(){
        if (!IsEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong ! tidak ada tugas yang dikumpulkan");
            return null;}
    }
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama+ "\t" +stack[i].Nim+ "\t" +stack[i].Kelas);
        }
        System.out.println(" ");
    }
    public Mahasiswa14 terkumpul() {
        if (!IsEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public int tambah() {
        return top + 1;
    }
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi14 stack = new StackKonversi14();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.Push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

