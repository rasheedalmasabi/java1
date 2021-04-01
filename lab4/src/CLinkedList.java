public class CLinkedList<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;
        public Node(E data) {
            this(data,null);
        }
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
        public E getData() { return this.data; }
        public Node<E> getNext() { return this.next; }
        public void setNext(Node<E> node) { this.next = node; }
        public String toString() { return this.data.toString(); }
    }
    private Node<E> tail = null;
    private int size = 0;

    public CLinkedList() { }
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[ ");
        if(isEmpty()) {
            sb.append("]");
            return sb.toString();
        } else {
            Node<E> runner = tail.getNext();
            sb.append(runner);
            for(int i=1; i<size; i++) {
                runner = runner.getNext();
                sb.append(", ");
                sb.append(runner);
            }
            sb.append(" ]");
            return sb.toString();
        }}
    public void rotate() {
        if(tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if( size==0 ) {
            tail = new Node<E>(e);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<E>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if(isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        size--;
        if(head.equals(tail)) {
            E value = tail.getData();
            tail = null;
            return value;

        } else {
            tail.setNext(head.getNext());
            return head.getData();
        }
    }

    public E first() {
        if(isEmpty()) {
            return null;
        }
        return tail.getNext().getData();}

    public E last() {
        if(isEmpty()) {
            return null;
        }
        return tail.getData();
    }
    public static void main(String[] args)  {
        CLinkedList<Integer> c = new CLinkedList<Integer>();
        for(int i=4; i<10; i++) {
            c.addFirst(i);}
        System.out.println(c);
        System.out.println("------");
        for(int i=100; i<106; i++) {
            c.addLast(i);}
        System.out.println(c);
        System.out.println("------");
        c.rotate();
        c.rotate();
        c.rotate();
        System.out.println(c);
        System.out.println("------");
        c.removeFirst();
        c.removeFirst();
        System.out.println(c);

    }
}
