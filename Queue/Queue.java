package Queue;

/**
 * @author Dimpleben Kanjibhai Patel
 * Operation on Queue
 * Enqueue()
 * Dequeue()
 */

//For creating new node
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    static Node front = null;
    static Node rear = null;

    public static void main(String args[]){
        System.out.println("Inserting an element in queue");
        enqueue(1);
        enqueue(10);
        enqueue(21);
        enqueue(45);
        enqueue(6);

        System.out.println("Displaying Queue");
        display();

        System.out.println("Performing Dequeue");
        dequeue();
        display();

    }

//    Function to perform Enqueue Operation
    public static void enqueue(int val){
        Node temp = new Node(val);
        if(front == null) {
            front = temp;
            rear = front;
        }
        else {
            rear.next = temp;
            rear = rear.next;
        }
    }

    //    Function to display queue
    public static void display() {
        Node temp = front;
        if (temp == null)
            System.out.println("Queue is empty");
        else {
            while (temp.next != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
        System.out.println();
    }

    public static void dequeue(){
        if(front == null) System.out.println("Queue is Empty");
        else
            front = front.next;
    }

}
