// (Superclass)
public class StackLinkedList {
    protected Node top;

    public StackLinkedList() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack kosong");
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}