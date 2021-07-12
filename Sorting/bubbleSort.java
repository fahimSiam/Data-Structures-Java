public class bubbleSort {
    public static int[] bubblerSort(int[] a, int i, int z){
        System.out.println("z is " +z);
        if(i==0) return a;
        for(int j=0;j<i;j++){

            if(a[j]>a[j+1]){
                z++;
                int temp= a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        return bubblerSort(a, i-1, z);
    
}


public static void main(String[] args){
    int a[]={4,2,1,6,3,5};
     int z=0;
    int b[]=bubblerSort(a, a.length-1,z);
    for(int k=0; k<b.length;k++){
        System.out.println(b[k]);
    }
}
}
