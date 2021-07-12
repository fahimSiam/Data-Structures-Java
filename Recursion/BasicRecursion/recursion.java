import java.lang.String;
public class recursion{
    Node head;
    public recursion(String s){

    }
    recursion() {
    }
    
    public recursion(int[] a) {
        head = new Node(a[0], null);
        Node current = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            current.next = temp;
            current = current.next;
        }
    }

    public recursion(recursion n) {
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
    
    public int stringLen(String s){
        if(s.equals("")) return 0;
        else return 1+ stringLen(s.substring(1));
    }


    public int listcountLen(Node cur){
        if(cur==null) return 0;
        else return 1+ listcountLen(cur.next);
    }
    public int listLen(){
        return listcountLen(head);
    }


    public int sumOfNum(int n){
        if(n==0) return 0;
        else return n+ sumOfNum(n-1);
    }


    public int powOfNum(int num, int pow){
        if(pow==0) return 1;
        else return num* powOfNum(num,pow-1);
    }

    
    public int bin2Dec(String s, int i, int num){
        if(s.length()==i) return num;
        if(s.charAt(i)=='0'){
            num=2*num;
        }
        else{
            num=2*num+1;
        }
        //System.out.println(num);

        return bin2Dec(s, i+1, num);
    }
    public int sumOfDigit(int i) {
        if(i==0) return 0 ;
        else {
            return i%10+ sumOfDigit(i/10);
        }
    }
    public int fact(int i) {
        if(i==0) return 1;
        else{
            return i* fact(i-1);
        }
    }
    public int fib(int i) {
        if(i==1 || i ==2) return 1;
        else{
            return fib(i-1)+ fib(i-2);
        }
    }
    public int grid(int i, int j) {
        if(i==0 || j==0)return 1;
        else{
            return grid(i-1,j) + grid(i,j-1);
        }
    }
    
}