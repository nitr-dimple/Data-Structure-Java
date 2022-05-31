package Stack;

/**
 * @author Dimpleben Kanjibhai Patel
 * Opetaion on Stack-
 * Push()
 * Pop()
 * Peek()
 * isEmpty()
 */

//For creating new node
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class Stack {
    public static void main(String args[]) {
        Node top = null;
//        Calling push
        top = push(top,1);
        top = push(top,5);
        top = push(top,2);
        top = push(top,7);
        top = push(top,10);
        top = push(top,20);

//        Display Stack
        System.out.println("Displaying Stack ");
        display(top);

//        Calling Pop
        System.out.println("Performing Pop Operation ");
        top = pop(top);

//        Display Stack
        System.out.println("Displaying Stack ");
        display(top);

//        Performing Peek Operation
        System.out.println("Performing Peek Operation ");
        int val = peek(top);
        System.out.println("Top Element: " + val);

//        Checking whether stack is empty or not
        boolean empty = isEmpty(top);
        System.out.println("Is Stack Empty: " + empty);

    }

//    Function to push an element
    public static Node push(Node top, int val) {
        if(top == null){
            top = new Node(val);
            top.next = null;
        }else {
            Node temp = top;
            while(temp.next != null) temp = temp.next;
            temp.next = new Node(val);
            temp.next.next = null;
        }
        return top;
    }

    //    Function to display stack
    public static void display(Node top) {
        Node temp = top;
        if (temp == null)
            System.out.println("Stack is empty");
        else {
            while (temp.next != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
        System.out.println();
    }

//    Function to pop an element
    public static Node pop(Node top){
        if(top == null){
            System.out.println("Stack is empty");
            return top;
        }
        return top.next;
    }

    //    Function to peek an element
    public static int peek(Node top){
        return top.data;
    }

    //    Function to check whether stack is empty or not
    public static boolean isEmpty(Node top){
        return top == null;
    }
}

