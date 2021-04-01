public class Node<E>  {
  int data;
     Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int d)
            
    {
        this.data = d;
        this.next = null;}}
class LinkedList<E>
{
    Node start;
    LinkedList()
    {
        start = null;
    }
    public void push(int data)
    {
        if(this.start == null)
        {
            Node temp = new Node(data);
            this.start = temp;
        }
        else
        {
            Node temp = new Node(data);
            temp.next = this.start;
            this.start = temp;}}
    public int findSecondL(Node ptr)
    {
        Node temp = ptr;
        if(temp == null || temp.next == null)
            return -1;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;}
    public static void main(String[] args){
        LinkedList a=new LinkedList();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        System.out.println(a.findSecondL(a.start));}}


