public class DoublyList {
    Node head;

    DoublyList() {
        int[] arr = {};
    }

    public DoublyList(int[] a) {
        head=new Node(0, null, null);
        //head.next = new Node(a[0], head, head);
        Node current = head;
        for (int i = 0; i < a.length; i++) {
            Node temp = new Node(a[i], null,null);
            current.next = temp;
            temp.next=head;
            head.prev=temp;
            current = current.next;
        }
    }

    //insert before in a dummy headed dubly linked circular list
    public void insertDDCBeforeList(Node head, int elem, int newElem) {
        Node current= head;
        Node element =new Node(elem, null , null);
        Node newNode =new Node(newElem, null , null);
        while(current.next!=head){
            if(current.next.value==element.value){
                Node temp= current.next;
                current.next= newNode;
                newNode.prev=current;
                newNode.next=temp;
                temp.prev=newNode;
            }
            current=current.next;
        }
    }




    public void showList() {
        if (head.next == null) {
            System.out.print("empty list");
        } else {
            Node cur=head;
            for (cur = head.next; cur.next != head; cur = cur.next) {
                System.out.print(cur.value + " ");
            }
            System.out.print(cur.value + " ");
        }
    }

    public void insert(Node newElement){
        int b= 0;
        Node current= head;
        //Node element =new Node(newElement, null , null);
        while(current.next!=head){
            if(current.value==newElement.value){
                System.out.println("the key already exists");
                b=1;
                break;
            }
            else{
                current=current.next;
            }
        }
        if(b == 0){
            Node temp=head.prev;
            temp.next=newElement;
            newElement.prev=temp;
            newElement.next=head;
            head.prev=newElement;
        }
    }
     public int check(int index){
        Node cur=head.next;
        int j=1;
        while(cur.next!=head){
            cur=cur.next;
            j++;
        }
        if(j>=index){
            return 0;
        }
        else{
            System.out.println("Invalid index");
            return 1;
        }

    }

    public void insert (int newElement, int index){
        int b= 0;
        Node current= head;
        b=check(index);
        Node elem =new Node(newElement, null , null);
        while(current.next!=head){
            if(current.value==elem.value){
                System.out.println("the key already exists");
                b=1;
                break;
            }
            else{
                current=current.next;
            }
        }
        if(b == 0){
            if(index==0) {
                head.next.prev=elem;
                elem.prev = head;
                elem.next = head.next;
                head.next = elem;
            }
            else{
                int i=0;
                Node cur=head.next;
                while(i<index-1){
                    cur=cur.next;
                    i++;
                }
                Node temp=cur.next;
                cur.next=elem;
                elem.next=temp;
                temp.prev=elem;
                elem.prev=cur;



            }

        }
    }

    public void remove ( int index){
        int b= 0;
        b=check(index);
        if(b == 0){
            if(index==0) {
                Node rem= head.next;
                rem.next.prev=head;
                head.next=rem.next;
                rem.prev=null;
                rem.next=null;
                rem.value=0;
                rem=null;
            }
            else{
                int i=0;
                Node cur=head.next;
                while(i<index-1){
                    cur=cur.next;
                    i++;
                }
                Node temp=cur.next;
                temp.next.prev=cur;
                cur.next=temp.next;
                temp.next=null;
                temp.prev=null;
                temp.value=0;
                temp=null;



            }

        }
    }

    public int removeKey(int deleteKey){
        Node cur=head.next;
        int j=0;
        for(j=0;cur.next!=head; j++){
            if(cur.value==deleteKey){
                remove(j);
                return j;
            }
            cur=cur.next;
        }
            return -1;
    }


}
