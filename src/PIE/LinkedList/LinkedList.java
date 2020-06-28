package PIE.LinkedList;



public class LinkedList {
    static Node head;

   public LinkedList(){
       Node newNode = new Node();
       head = newNode;
    }

    //push
   public static void insertBegining(Node a){
       a.next = head;
       head = a;
    }

    //pop
    public static void removeBegining(Node nodeTBD){
        if(nodeTBD != head)
            throw new Error();

        head = nodeTBD.next;
        int data = nodeTBD.data;
        System.out.println(data);

    }
    //Create a stack from linked list. We need pop and push

    public static void push(Node a){
       insertBegining(a);
    }

    public static void pop(){
        removeBegining(head);

    }

    public static void peekTop(){
       System.out.println(head.data);
    }

    public static boolean isEmpty(){
       if(head.next == null){
           return true;
       }
       return false;
    }

    public static void main(String[] args){
       LinkedList stackLinkedList = new LinkedList();
       Node a,b,c;

       a = new Node();
       a.data = 17;

       b = new Node();
       b.data = 29;

       c = new Node();
       c.data = 42;

       stackLinkedList.push(a);
       stackLinkedList.push(b);
       stackLinkedList.push(c);

       System.out.println(isEmpty());

       peekTop();

       pop();
       pop();


   }

}
