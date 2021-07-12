public class problem5b {
    //the function we need to call in main function is patternA
    public void patternB(int n){
        int line=n;
        printing(line,n);
        return;
    }

    public void printing(int line, int n){
        if(line==0){
            return;
        }
        spaces(line-1);
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

    public void spaces(int line){
        if(line==0) return;
        System.out.print("  ");
        spaces(line-1);
        return;
    }


    public static void main(String [] args){ 
        problem5b num= new problem5b();
        num.patternB(5); 
        } 
}
 