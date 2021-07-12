
public class Tester {
    public static void main(String[] args){
       int[] a = {5, 12, 6, 6, 35, 10, 12, 90};
        searchAndSort num = new searchAndSort();
        //task 1
       // int b[]=num.selectionrSort(a,a.length-1);
       // num.printArray(b);

       //task 2
       // int b[]=num.insertionrSort(a, 0);
       // num.printArray(b);

       //task 3
       // searchAndSort list1 = new searchAndSort(a);
        //list1.bubbleSort();
       // list1.selectionSort();
       // list1.showList();
        //int[] b=num.bubbleSort(a);
        //num.printArray(b);

        //TASK 6
        int p = num.binaryrSearch(a, 0, a.length-1, 35);
        System.out.println(p);
        //task 7
        //System.out.println(num.fibmem(22));

        
    }
}