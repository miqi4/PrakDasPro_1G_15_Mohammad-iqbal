package semester2.jobsheet12.tugas2;
public class DDLFilm {
    FilmNode14 head;
    int size;
    public DDLFilm() {
        head = null;
        size = 0;}
    public boolean isEmpty() {
        return head == null;}
    public void addFirst(Film14 item) {
        if (isEmpty()) {
            head = new FilmNode14(null, item, null);
        } else {
            FilmNode14 newNode = new FilmNode14(null, item, head);
            head.prev = newNode;
            head = newNode;}
        size++;}
    public void addLast(Film14 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            FilmNode14 current = head;
            while (current.next != null) {
                current = current.next;}
            FilmNode14 newNode = new FilmNode14(current, item, null);
            current.next = newNode;
            size++;
        }}
    public void add(Film14 item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            FilmNode14 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                FilmNode14 newNode = new FilmNode14(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                FilmNode14 newNode = new FilmNode14(current.prev, item, current);
                current.prev.next = newNode;
                current.prev = newNode;}}
        size++;}
    public void removeFirst() throws Exception {
        if (isEmpty()) throw new Exception("Linked list kosong");
        if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;}
        size--;}
    public void removeLast() throws Exception {
        if (isEmpty()) throw new Exception("Linked list kosong");
        if (head.next == null) {
            head = null;
        } else {
            FilmNode14 current = head;
            while (current.next.next != null) {
                current = current.next;}
            current.next = null;}
        size--;}
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) throw new Exception("Indeks di luar batas");
        if (index == 0) {
            removeFirst();
        } else {
            FilmNode14 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;}
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;}
            size--;
        }}
    public void print() {
        if (!isEmpty()) {
            FilmNode14 tmp = head;
            while (tmp != null) {
                System.out.println( "ID: " + tmp.data.id + "\tJudul Film: " + tmp.data.judul + "\tRating: " + tmp.data.rating + "\t");
                tmp = tmp.next;}
        } else {System.out.println("Daftar film kosong.");}}
    public Film14 cariId(int id) {
        FilmNode14 tmp = head;
        while (tmp != null) {
            if (tmp.data.id == id) return tmp.data;
            tmp = tmp.next;}
        return null;}
    public void urutrating() {
        if (isEmpty() || head.next == null) return;
        FilmNode14 outer = head;
        while (outer != null) {
            FilmNode14 max = outer;
            FilmNode14 inner = outer.next;
            while (inner != null) {
                if (inner.data.rating > max.data.rating) {
                    max = inner;
                }
                inner = inner.next;}
            if (max != outer) {
                Film14 temp = outer.data;
                outer.data = max.data;
                max.data = temp;}
            outer = outer.next;
        }}
    public int size() {
        return size;
    }}
