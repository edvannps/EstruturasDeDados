package dataStructure;

public class Stack {

    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Altura: " + height);
    }

    public void print() {
        System.out.println("*********************");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("*********************");
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();
        myStack.print();
    }
}
