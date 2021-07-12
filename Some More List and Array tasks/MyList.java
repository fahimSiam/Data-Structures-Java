import java.util.Random;
import java.util.*;
public class MyList {
    Node head;
    MyList() {
        int[] arr={};
    }
    public MyList(int[] a) {
        head = new Node(a[0], null);
        Node current = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            current.next = temp;
            current = current.next;
        }
    }


    public MyList(MyList a) {
        head = new Node(a.head.value,null);
        Node currentNode = head;
        Node nextInfo = new Node(a.head.value, a.head.next);
        while (nextInfo.next != null) {
            Node nextNode = new Node(nextInfo.next.value, null);
            currentNode.next = nextNode;
            currentNode = currentNode.next;
            nextInfo = nextInfo.next;
        }
    }

    public void printDuplicate(Node h){
        Node current =h;
        boolean b = false;
        while(current.next!=null){
            Node index= current.next;
            while (index.next!=null){
                if(current.value== index.value){
                    System.out.println(current.value);
                    b = true;
                    break;
                }
                index=index.next;
            }
            if(b ==true){
                break;
            }
            else{
            current=current.next;
        }}
        if(b ==false){
            System.out.println("No Duplicates!");
        }
    }

    //add value of two dummy lists and make another
    public MyList listsSum(Node h1, Node h2){
        int l1sum=0;
        int l2sum=0;
        for(Node current=h1.next; current!=null; current=current.next){
            l1sum = l1sum* 10;
            l1sum = l1sum+current.value;
        }

        for(Node current=h2.next; current!=null; current=current.next){
            l2sum = l2sum*10;
            l2sum += current.value;
        }
        int sum= l1sum+l2sum;
        int copySum=sum;
        int count = 0;
        while (sum!=0) {
            sum/=10;
            ++count;
        }

        int c= (int) Math.pow(10, count-1);
        int[] sumArray=new int[count+1];
        sumArray[0]=0;

        int num;
        for(int i=1;i<count+1;i++) {
            num=copySum/c;
            copySum= copySum%c;
            c= c/10;
            sumArray[i]=num;
        }

        MyList newList= new MyList(sumArray);
        return newList;
    }






    public void removeMultiplesFive(Node h){

        Node current = h;
        while(current.next != null){
            if(current.value%5==0){
            head= head.next;
        }

            if (current.next.value % 5 == 0) {
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }


    public void showList() {
        if (head == null) {
            System.out.print("empty list");
        } else {
            for (Node cur = head; cur != null; cur = cur.next) {
                System.out.print(cur.value + " ");
            }
        }
    }
}