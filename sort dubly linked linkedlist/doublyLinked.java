package dublyLinked;

public class doublyLinked {
    Node head;
    int size=1;


    public doublyLinked(int[] a) {
        head=new Node(a[0], null, null);
        //head.next = new Node(a[0], head, head);
        Node current = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null,null);
            current.next = temp;
            temp.prev=current;
            current = current.next;
            size++;
        }
    }
    

    public void insertionSort(){
    for(Node cur=head; cur!=null; cur=cur.next){       
        int temp=cur.value;
        Node arekNode=cur;
        while(arekNode.prev!=null && arekNode.prev.value>temp){
              arekNode.value=arekNode.prev.value;
              arekNode=arekNode.prev;
              }
           
       arekNode.value=temp;
       //nextNode=nextNode.next;
    }
    }

    public void showList(){
        if (head == null) {
            System.out.print("empty list");
        } 
        else {
            for (Node cur = head; cur != null; cur = cur.next) {
                System.out.print(cur.value + " ");
                
            }
           // System.out.print("size is:  "+ size  );
        }
    }
    
}
