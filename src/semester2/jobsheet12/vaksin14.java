package semester2.jobsheet12;
public class vaksin14 {
    vaksinNode14 head;
    int size;
    public vaksin14(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(vaksinData14 item){
        if (isEmpty()) {
            head=new vaksinNode14(null,item,null);
        }else{
            vaksinNode14 newNode = new vaksinNode14(null, item, head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public void addLast(vaksinData14 item) {
        if (isEmpty()) {
            addFirst(item);
            } else {
            vaksinNode14 current = head;
            while (current.next != null) {
            current = current.next;
            }
            vaksinNode14 newNode = new vaksinNode14(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next==null) {
            head=null;
            size--;
            return;
        }
        vaksinNode14 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if( size==1){
            removeLast();
        }else{
            head = head.next;
            head.prev=null;
            size--;
        }
    }
    public void print() {
        if (!isEmpty()) {
            vaksinNode14 tmp = head;
            System.out.println("Daftar Antrian Vaksin:");
            while (tmp != null) {
                System.out.println("nama "+tmp.data.nama+" dengan nomor antrian "+tmp.data.nomor);
                tmp = tmp.next;
            }
            System.out.println("Jumlah Antrian Saat Ini: " + size);
        } else {
            System.out.println("Antrian vaksin kosong.");
        }
    }
}
