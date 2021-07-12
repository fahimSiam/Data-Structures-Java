public class KeyIndex{
    public int [] k;
    //public int n=0;
    int min;

    public KeyIndex(int[] a){
        //len=a.length;
        int max=a[0];
        min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }

        //fixing minus int
        if(min<0){     
            min=min*(-1);
        }
            max=max+min;
            k=new int[max+1];
            
            for(int n=0;n<a.length;n++){
                a[n]=a[n]+min;
            }
        

        //making the array
        for(int n=0;n<a.length;n++){
            int q=a[n];
            k[q]=k[q]+1;
    }

    
}


public boolean search(int val){
    val=val+min;
    if(val<0 || val>k.length){
        return false;
    }
    if(k[val]>0) return true;
    else{ 
        return false;
    }
}


public int[] sort(){
    //determining the size of the new array using keyIndex array
    int len=0;
    for(int z=0; z<k.length; z++){
        if(k[z]>0){
            len=len+k[z];
        }
    }
    int [] b = new int[len];
    int n=0;
    for(int j=0;j<len;){
        if(k[n]>0){
            while(k[n]>0){
                b[j]=n-min;
                k[n]=k[n]-1;
                j++;
            }
            n++;
        }
        else{
            n++;
        }
    }
    return b;
} 


public void printArray(int[] b){
        for(int j=0; j<b.length;j++){
            System.out.print(b[j]+" ");
        }
        System.out.println();
     }

    
}