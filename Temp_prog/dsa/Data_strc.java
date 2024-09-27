package dsa;
public class Data_strc {
    public static void main(String[] args) {
        /*
         * Stack st = new Stack(10);
         * 
         * st.push(1);
         * st.push(2);
         * st.push(3);
         * st.push(4);
         * st.push(5);
         * st.push(6);
         * st.push(7);
         * st.push(8);
         * st.push(9);
         * 
         * System.out.println("top of stack = " + st.top());
         * System.out.println("bottom of stack = " + st.bottom());
         * st.display();
         * 
         * st.push("hi");
         * st.push("uwu");
         * 
         * System.out.println("top of stack = " + st.top());
         * System.out.println("bottom of stack = " + st.bottom());
         * st.display();
         */

        Queue qt = new Queue(10);

        qt.enqueue(1);
        qt.enqueue(2);
        qt.enqueue(3);
        qt.enqueue(4);
        qt.enqueue(5);
        qt.enqueue(6);
        qt.enqueue(7);
        qt.enqueue(8);
        qt.enqueue(9);
        System.out.println("Front element in Queue = " + qt.front());
        System.out.println("Back element in Queue = " + qt.back());
        qt.dequeue();

        System.out.println("AFTER DEQUEUE");

        System.out.println("Front element in Queue = " + qt.front());
        System.out.println("Back element in Queue = " + qt.back());

        qt.display();
    }
}
