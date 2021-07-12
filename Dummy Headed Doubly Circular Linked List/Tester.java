public class Tester {



    public static void main(String[] args) {
        int[] a = {5, 12, 6, 35, 10, 12, 90};
        DoublyList list1 = new DoublyList(a);
       // list1.insertDDCBeforeList(list1.head,6, 65);
        Node newNode= new Node(65, null, null);
       list1.insert(newNode);
       //list1.showList();
       // list1.insert(69, 7);
      //  list1.showList();
      //  list1.remove(0);
       list1.showList();
        System.out.println("the removed Key index is " + list1.removeKey(35));
        list1.showList();

    }
}
