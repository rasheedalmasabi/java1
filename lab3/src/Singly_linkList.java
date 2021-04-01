public class Singly_linkList<E>
{
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node head = null;
    public Node tail = null;
    int size = 0;

    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }

    public E first() {
        if (size == 0) return null;
        else return (E) head.getElement();

    }

    public E last(){
        if (size == 0) return null;
        else return (E) tail.getElement();
    }

    public int size(){return size;}

    public void addfirst(E element){
        head=new Node<E>(element,head);
        if (size==0) tail=head;
        size++;}

    public void addlase(E element){
        Node<E> newnod= new Node<E>(element,null);
        if (size==0)
            head=newnod;
        else tail.setNext(newnod);
        tail=newnod;
        size++;
    }

    public E removeFirst() {
        E deleted=(E) head.element;
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        if (size==0)return null;
        return (E) deleted;
    }

    public void print(){

        while (head.getNext()!=null){
            System.out.println(head.getElement());
           head=head.getNext();
        }
        System.out.println(tail.getElement());
        }



}
