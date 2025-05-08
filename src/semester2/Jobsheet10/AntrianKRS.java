package semester2.Jobsheet10;
public class AntrianKRS {
    Krs14[] data;
    int front, rear, size, max;
    int jumlahKRS;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Krs14[max];
        front = rear = -1;
        size = 0;
        jumlahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(Krs14 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa proses 2 mahasiswa.");
            return;
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("Memproses: ");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahKRS++;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void printFront2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void printRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            data[rear].tampilkanData();
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahSudahKRS() {
        return jumlahKRS;
    }

    public int jumlahBelumKRS() {
        return 30 - jumlahKRS;
    }
}
