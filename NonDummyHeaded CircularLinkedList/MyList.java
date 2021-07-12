public class MyList {
    Node head;

    MyList() {
        int[] arr = {};
    }

    public MyList(int[] a) {
        head = new Node(a[0], null);
        Node current = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            current.next = temp;
            current = current.next;
        }
        current.next=head;
    }

    //insert in a non dummy circular linked circular list
    public void insertCircularList(int value, int index){
        int i=1;
        int size=1;


        Node newNode= new Node(value, null);
        for(Node cur=head.next;cur!=head;cur=cur.next){
            size++;
        }
        //inserting at the end
        if(index%size==0){
            Node cur=head;
            while(cur.next!=head){
                cur=cur.next;
            }
            cur.next=newNode;
            newNode.next=head;
            head=newNode;
        }
        //insert anywhere else
        else{
            Node cur=head;
            while(i<index){
                cur=cur.next;
                i++;
            }
            Node temp= cur.next;
            cur.next=newNode;
            newNode.next=temp;
        }
    }


    public void showList() {
        if (head == null) {
            System.out.print("empty list");
        } else {
            for (Node cur = head; cur.next != head; cur = cur.next) {
                System.out.print(cur.value + " ");
            }
        }
    }



}
