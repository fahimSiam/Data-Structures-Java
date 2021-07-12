public class binarySeach{
    public static int binary(int a[], int val){
        int l=0;
        int r=a.length-1;
        int z=0;
        while(l<=r){
            int m=(l+r)/2;
            z++;
            System.out.println("z is "+z);
            if(val==a[m]) return m;
            else if(val>a[m]){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return -1;

    }

    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        System.out.println(binary(a,6));
    }


}