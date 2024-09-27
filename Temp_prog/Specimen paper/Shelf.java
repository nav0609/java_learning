public class Shelf {
    int lim, front, rear;
    double ele[]=new double[20];

    Shelf(int n) {
        lim = n;
        rear = 0;
        front = 0;
    }

    void pushVal(double v) {
        if(rear==lim-1)
        System.out.println("Queue is Full!");
        else{
            ele[rear]=v;
            rear++;
        }
    }

    double popVal() {
        if(front==0&&rear==0){
            throw new RuntimeException("-999.99");
        }
        else
        return ele[front];
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println("|\t" + ele[i] + "\t|");
        }
    }
    public static void main(String[] args) {
        Shelf ob =new Shelf(4);
        ob.pushVal(3.0);
        ob.popVal();
        ob.display();
    }
}
