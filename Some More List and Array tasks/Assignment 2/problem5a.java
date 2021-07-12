public class problem5a {
    //the function we need to call in main function is patternA
    public void patternA(int n){
        int line=n;
        printing(line,n);
        return;
    }

    public void printing(int line, int n){
        if(line==0){
            return;
        }
        row(n-line+1,1);
        System.out.println();
        printing(line-1,n);
    }
    public void row(int line, int n){
        if(line==0) return;
        System.out.print(n+" ");
        row(line-1,n+1);
        return;
    }


    public static void main(String [] args){ 
        problem5a num= new problem5a();
        num.patternA(5); 
        } 
}
 