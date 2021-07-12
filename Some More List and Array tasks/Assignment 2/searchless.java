//public class searchless {
    
    //static int midIndex;
    public static int binaryModSearch(int a1[], int l, int r, int z) {
        //int midIndex;
       int midIndex = (l + r)/ 2;
        if (r>=l){
            if (a1[midIndex] == z) {
                while(midIndex<a1.length-1 && a1[midIndex+1]==z){
                    midIndex++;
                }
                return midIndex+1;
                
            }
            if (a1[midIndex] > z) {
              //  System.out.println(">z hoise");
                return binaryModSearch(a1, l, midIndex-1, z);
            }
            else{
               // System.out.println("<z hoise");
                return binaryModSearch(a1, midIndex + 1, r, z);
            }
        }
        else{
            if(a1[0]>z){
                return 0;
            }
            else{
            return midIndex+1;
        }
    }
    }


    public static void ChotoKotojon(int []arr1, int []arr2, int idx ){
        if(idx<arr2.length){
            int index=binaryModSearch(arr1,0,arr1.length-1,arr2[idx]);
            System.out.print(index+" ");
            ChotoKotojon(arr1, arr2, idx+1);
        }
    }

/*
    public static void main(String [] args){  
     int[] arr1={1,1,2,2,5};
     int[] arr2={3,1,4,1,5};
     ChotoKotojon(arr1, arr2, 0);
    }
}

*/
    
    

