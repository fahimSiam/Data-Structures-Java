package dublyLinked;

public class Tester {
    public static void main(String[] args){
       int[] a = {5, 12, 6, 6, 35, 10, 12, 90};
        //task 5
        doublyLinked list1 = new doublyLinked(a);
        //list1.bubbleSort();
        list1.insertionSort();
        list1.showList();
        
    }
}