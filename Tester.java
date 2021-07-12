import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int select = n.nextInt();
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
       // System.out.println(input);
        Stack k = new Stack();
        if(select==0) {
            k.arrayStack(input);
        }
        else if(select==1){
            char [] a = new char['0'];
            Stack list1 = new Stack(a);

            list1.listStack(input);
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
