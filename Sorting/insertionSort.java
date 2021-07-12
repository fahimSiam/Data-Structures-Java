public class insertionSort {
    public static int[] insertionrSort(int[] a, int i){
        if(i==a.length) return a;
       int temp;
        //PROTI BAR LENGTH BARAY BARAY SORT KORE NEW ELEMENT K JOTO RIGHT E NEYA JAE
        //PROTIBAR SORT KORTE HOBE NEW ELEM K NIYE
       // vitorerLoop(a, i, 0);
        for(int j=i-1; j>=0; j--){
            if(a[j]>a[j+1]){
              temp=a[j+1];
              a[j+1]=a[j];
              a[j]=temp;
            }
           else{
              break;
          }
       }
       for(int k=0; k<b.length;k++){
        System.out.println(b[k]);
    }
       
        return insertionrSort(a, i+1);
    }

 



    public static void main(String[] args){
        int a[]={11, 13, 15, 12, 14};
        int b[]=insertionrSort(a, 0);
        for(int k=0; k<b.length;k++){
            System.out.println(b[k]);
        }
    }
}

