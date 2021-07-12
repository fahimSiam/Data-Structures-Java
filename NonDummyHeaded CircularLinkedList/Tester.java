public class Tester {



    public static void main(String[] args) {

        int[] a = {5, 12, 6, 6, 35, 10, 12, 90};
        MyList list1 = new MyList(a);
        list1.insertCircularList(65, 2);
        list1.showList();

    }
}
