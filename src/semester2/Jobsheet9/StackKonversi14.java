package semester2.Jobsheet9;
public class StackKonversi14 {
    int[] TumpukanBiner;
    int top;
    int size;
    public StackKonversi14(){
        this.size=32;
        TumpukanBiner = new int [size];
        top=-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isfull(){
        return top == size -1;
    }
    public void Push(int data){
        if (isfull()) {
            System.out.println("stack penuh");
        }else{
            top++;
            TumpukanBiner[top] = data;
        }
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("stack kosong");
            return -1;
        }else{
            int data = TumpukanBiner[top];
            top--;
            return data;
        }
    }
}
