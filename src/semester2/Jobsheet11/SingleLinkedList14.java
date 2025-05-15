package semester2.Jobsheet11;
public class SingleLinkedList14 {
    Node14 Head;
    Node14 tail;
    boolean isEmpty(){
        return(Head==null);
    }
    public void print(){
        if (!isEmpty()) {
            Node14 tmp = Head;
            System.out.println("Isi Linked List :\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.Next;
            }
            System.out.println();
        }else{
            System.out.println("Linked list kosong");}}
    public void addfirst(Mahasiswa14 input){
        Node14 ndInput = new Node14(input, null);
        if (isEmpty()) {
            Head = ndInput;
            tail =  ndInput;
        }else{
            ndInput.Next= Head;
            Head = ndInput;}}
    public void addLast(Mahasiswa14 input){
        Node14 ndInput = new Node14(input, null);
        if (isEmpty()) {
            Head = ndInput;
            tail =  ndInput;
        }else{
            tail.Next= ndInput;
            tail = ndInput;}}
    public void insertAfter(String key , Mahasiswa14 input ){
        Node14 ndInput = new Node14(input, null);
        Node14 temp = Head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.Next = temp.Next;
                temp.Next = ndInput;
                if (ndInput.Next==null) {
                    tail=ndInput;
                }break;}
            temp = temp.Next;
        } while (temp !=null);
    }
    public void insertAt(int index , Mahasiswa14 input){
        if (index<0) {
            System.out.println("index salah");
        }else if (index==0) {
            addfirst(input);
        }else{
            Node14 temp = Head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.Next;}
            temp.Next = new Node14(input, temp.Next);
            if (temp.Next.Next==null) {
                tail=temp.Next;
            }
        }
    }
    public void getData(int index){
        Node14 tmp = Head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.Next;
        }
        tmp.data.tampilInformasi();
    }
    public int indexOf(String key) {
        Node14 tmp = Head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.Next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (Head == tail) {Head = tail = null;
        } else {Head = Head.Next;}}
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (Head == tail) {
            Head = tail = null;
        } else {
            Node14 temp = Head;
            while (temp.Next != tail) {
                temp = temp.Next;
            }
            temp.Next = null;
            tail = temp;}}
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            Node14 temp = Head;
            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key) && temp == Head) {
                    this.removeFirst();
                    break;
                } else if (temp.Next.data.nama.equalsIgnoreCase(key)) {
                    temp.Next = temp.Next.Next;
                    if (temp.Next == null) {
                        tail = temp;
                    }break;}
                temp = temp.Next;}}}
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node14 temp = Head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.Next;
            }
            temp.Next = temp.Next.Next;
            if (temp.Next == null) {
                tail = temp;
            }}}}

