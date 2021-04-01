//
//    import java.util.HashMap;
// import java.util.Map;
//
//public class MethodCopy {
//
//
//        int data;
//        MethodCopy next;
//    MethodCopy random;
//
//
//        public MethodCopy(int data)
//        {
//            this.data = data;
//            this.next = this.random = null;
//        }
//    }
//
//  public   class LinkedList
//    {
//        Node head;
//
//
//        public LinkedList(MethodCopy head)
//        {
//            this.head = head;
//        }
//
//        public void push(int data)
//        {
//            MethodCopy node = new MethodCopy(data);
//            MethodCopy.next = this.head;
//            this.head = node;
//        }
//
//        // Method to print the list.
//        void print()
//        {
//            MethodCopy temp = head;
//            while (temp != null)
//            {
//                MethodCopy random = temp.random;
//                int randomData = (random != null)? random.data: -1;
//                System.out.println("Data = " + temp.data +
//                        ", Random data = "+ randomData);
//                temp = temp.next;
//            }
//        }
//
//        // Actual clone method which returns head
//        // reference of cloned linked list.
//        public LinkedList clone()
//        {
//            // Initialize two references, one with original
//            // list's head.
//            Node origCurr = this.head, cloneCurr = null;
//
//            // Hash map which contains node to node mapping of
//            // original and clone linked list.
//            Map<Node, Node> map = new HashMap<Node, Node>();
//
//            // Traverse the original list and make a copy of that
//            // in the clone linked list.
//            while (origCurr != null)
//            {
//                cloneCurr = new Node(origCurr.data);
//                map.put(origCurr, cloneCurr);
//                origCurr = origCurr.next;
//            }
//
//            // Adjusting the original list reference again.
//            origCurr = this.head;
//
//            // Traversal of original list again to adjust the next
//            // and random references of clone list using hash map.
//            while (origCurr != null)
//            {
//                cloneCurr = map.get(origCurr);
//                cloneCurr.next = map.get(origCurr.next);
//                cloneCurr.random = map.get(origCurr.random);
//                origCurr = origCurr.next;
//            }
//
//            //return the head reference of the clone list.
//            return new LinkedList(map.get(this.head));
//        }
//    }
//
//    // Driver Class
//    class Main
//    {
//        // Main method.
//        public static void main(String[] args)
//        {
//            // Pushing data in the linked list.
//            LinkedList list = new LinkedList(new Node(5));
//            list.push(4);
//            list.push(3);
//            list.push(2);
//            list.push(1);
//
//            // Setting up random references.
//            list.head.random = list.head.next.next;
//            list.head.next.random =
//                    list.head.next.next.next;
//            list.head.next.next.random =
//                    list.head.next.next.next.next;
//            list.head.next.next.next.random =
//                    list.head.next.next.next.next.next;
//            list.head.next.next.next.next.random =
//                    list.head.next;
//
//            // Making a clone of the original linked list.
//            LinkedList clone = list.clone();
//
//            // Print the original and cloned linked list.
//            System.out.println("Original linked list");
//            list.print();
//            System.out.println("\nCloned linked list");
//            clone.print();
//        }
//    }
//
//
//
