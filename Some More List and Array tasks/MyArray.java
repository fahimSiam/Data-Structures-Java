import java.util.Random;

public class MyArray {
   
   
    public  void rotateRight(String[] arr){
        String x = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }

    public  String [] copyArray(String [] arr, int remove,int i){
        String [] arr1 = new String [i-1];

        for (int j=0; j<arr.length; j++) {
            if (j== remove){
            }
            else if(j>remove) {

                arr1[j-1]=arr[j];
            }
            else{
                arr1[j]=arr[j];
            }
        }
        return arr1;
    }

    public void musicChair(String[] array){
        Random rand = new Random();
        int i=7;
        while(i>0){
            int ran =rand.nextInt(3);
            if (ran!=1){
                rotateRight(array);
            }
            else{
                int remove= i/2;
                array= copyArray(array, remove, i);
                showArray(array);
                i--;
            }
        }
    }

    public void showArray(String[] arr) {
        if (arr.length == 1) {
            System.out.print("Winner is "+ arr[0]);
        } else {
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        String[] array = new String[] {"Siam", "Sami", "Faiza", "Moo", "Galib", "Trina", "Muizz"};
        MyArray t= new MyArray();
        t.musicChair(array);
    }
}