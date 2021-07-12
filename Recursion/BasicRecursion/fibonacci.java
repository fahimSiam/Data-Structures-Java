public class fibonacci{
    public static int a[]= new int[100];

    public static int fibmem(int n){
        if(a[n]>0) return a[n];
        if(n==1 || n==2) return a[n]=1;
        else return a[n]= fibmem(n-1)+ fibmem(n-2);
    }

    public static void main(String[] args){
        int n=22;
        final long startTime = System.nanoTime();
        System.out.println(fibmem(n));
        final long duration = (System.nanoTime()-startTime);
        System.out.println("duration: "+duration);


}
}