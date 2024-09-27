class Node {
    int n;
    Node next;

    Node(int input) {
        n = input;
        next = null;
    }
}


public class LL_Product {
    Node head;

    // 1 -> 2 -> 3 -> 4 -> 5 -> null
    //                |
    //               head
    public void insert(int input) {
        Node newNode = new Node(input);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.n + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int product() {
        Node temp = head;
        int product = 1;
        while (temp != null) {
            product *= temp.n;
            temp = temp.next;
        }
        return product;
    }

    public static void main(String[] args) {
        LL_Product list = new LL_Product();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        System.out.println("Product: " + list.product());
    }
}
