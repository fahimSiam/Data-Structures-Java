public class friday {
    
    //THIS IS THE FUNCTION TO CALL IN THE MAIN METHOD
    public static void FridayFun(int n, String s){
        String[] players =new String[n];
        players=makePlayers(players,0);
       // showArray(players);
       musicChair(n, s,players, 0,0);
      //showArray(players);
    }

    //making an array of players with their index values to keep track
    public static String[] makePlayers(String[] players, int idx){
        if(idx<players.length){
            players[idx]=String.valueOf(idx);
            makePlayers(players,idx+1);
           
        }
        return players;
    }

    public static void musicChair(int n, String s, String[] players, int si, int p){
       // Random rand = new Random();
       if(n>1){
            char ran =s.charAt(si);
           // System.out.println("ran "+ran);
            if (ran=='2' || ran=='4'){
              //  System.out.println("if hocche");

                int remove= p;
              //  System.out.println("n "+n);
                players= copyArray(players, remove, n);
                showArray(players);
               

                n--;
               /* if(p>=n-1){
                    p=0;
                }
                else{
                    p++;
                }
                */
                
            }

            else{
               
                //System.out.println("else hocche");
                players=rotateRight(players);
                if(p>=n-1){
                    p=0;
                }
                else{
                    p++;
                }
                
            }


            if(si>=s.length()-1){
                si=0;
            }
            else{
                si++;
            }


          musicChair(n,s,players,si,p);
         
        }
}
    




    public static  String[] rotateRight(String[] arr){
        String x = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    return arr;
    }

    public static String [] copyArray(String [] arr, int remove,int n){
        String [] arr1 = new String [n-1];

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

    public static void showArray(String[] arr) {
        if (arr.length == 1) {
            int winner= Integer.parseInt(arr[0])+1;
            System.out.println("Winner is Player "+ winner);
        }
        else {
           /* for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        */}
    }



    public static void main(String [] args){
       // String[] players =new String[5];
        //players=makePlayers(players, 0);
        FridayFun(3, "152");
       }
}

