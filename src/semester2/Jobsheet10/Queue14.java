package semester2.Jobsheet10;
public class Queue14 {
    int front,rear,size,max;
    int[]data;
    public Queue14(int n){
        max=n;
        data=new int[max];
        size=0;
        front=rear=-1;
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
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("elemen terdepan "+data[front]);
        }
    }
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i =front;
            while (i!=rear) {
                System.out.println(data[i]+" ");
                i=(i+1)%max;
            }
        System.out.println(data[i]+" ");
        System.out.println("jumlah elemen "+ size);
        }
    }
    public void clear(){
        if (!IsEmpty()) {
            front=rear=-1;
            size=0;
            System.out.println("queue berhasil dikosongkan");
        } else{
            System.out.println("queue masih kosong");
        }
    }
    public void enqueue(int dt){
        if (Isfull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if (IsEmpty()) {
                front=rear=0;
            }else{
                if (rear==max-1) {
                    rear=0;
                }else{
                    rear++;
                }
            }
            data[rear]=dt;
            size++;
        }
    }
    public int Dequeue(){
        int dt=0;
        if (IsEmpty()) {
            System.out.println("queue masih kosong");
        }else{
            dt=data[front];
            size--;
            if (IsEmpty()) {
                front=rear=-1;
            }else{
                if (front==max-1) {
                    front=0;
                }else{
                    front++;
                }
            }
        }
    return dt;
    }
}
