public class selectionSort{
    public static int[] selectionrSort(int a[], int i){
        if (i==0) return a;
        int max, maxi,temp;
        max=-9999;
        maxi=-1;
        for(int j=0; j<=i; j++){
            if(max<a[j]){
                max=a[j];
                maxi=j;
            }
        }
        temp=a[maxi];
        a[maxi]=a[i];
        a[i]=temp;
        return selectionrSort(a, i-1);
    }
    //FIND THE MAX VALUE AND MAX INDEX EVERYTIME AND SWAP WITH LAST MOST INDEX
    
    

    public static void main(String[] args){
        int a[]={10,2 , 5, 3, 6, 1,9};
        int b[]=selectionrSort(a, a.length-1);
        for(int k=0; k<b.length;k++){
            System.out.println(b[k]);
        }
    }
}