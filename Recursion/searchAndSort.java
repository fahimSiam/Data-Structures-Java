public class searchAndSort {
    Node head;
    int size=1;
    int z=0;
    public searchAndSort(){
    }
    //TASK 1
    public int[] selectionrSort(int a[], int i){
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

//TASK 2
public int[] insertionrSort(int[] a, int i){
    if(i==a.length) return a;
   int temp;
    //PROTI BAR LENGTH BARAY BARAY SORT KORE NEW ELEMENT K JOTO RIGHT E NEYA JAE
    //PROTIBAR SORT KORTE HOBE NEW ELEM K NIYE
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
    return insertionrSort(a, i+1);
}



//TASK 3

public searchAndSort(int[] a) {
    head = new Node(a[0], null);
    Node current = head;
    for (int i = 1; i < a.length; i++) {
        size++;
        Node temp = new Node(a[i], null);
        current.next = temp;
        current = current.next;
    }
    System.out.println("size is "+size);

}



public void bubbleSort(){
   if(size>1){
    for(int i=0 ; i<size;i++){
    Node cur=head;
    Node nextNode=head.next;
    for(int j=0;j<size-1;j++){
        if(cur.value>nextNode.value){
            z++;
            int temp= cur.value;
            cur.value=nextNode.value;
            nextNode.value=temp;
        }
        cur=nextNode;
        nextNode=nextNode.next;
    }
    size--;
    //System.out.println("z is " +z);
   }
}
}

//TASK 4
public void selectionSort(){
    for(int i=size-1; i>=0;  i--){
    int max,temp;
    max=-9999;
    Node cur=head;
    Node maxNode= cur;
    Node lastNode=cur;
    for(int j=0; j<=i; j++){
        if(max<cur.value){
            max=cur.value;
            maxNode=cur;
        }
        lastNode=cur;
        cur=cur.next;
    }
    temp=lastNode.value;
    lastNode.value=maxNode.value;
    maxNode.value=temp;
}
}



//TASK 5
//Done in a different file


//TASK 6
public int binaryrSearch(int a1[], int l, int r, int z) {

    if (r>=l){

        int midIndex = (l + r)/ 2;
        if (a1[midIndex] == z) {
            return midIndex;
        }
        if (a1[midIndex] > z) {
            return binaryrSearch(a1, l, midIndex, z);

        }
        else{

            return binaryrSearch(a1, midIndex + 1, r, z);
        }

    }
        return -1;
}

//TASK 7
public static int a[] = new int[100];
public  int fibmem(int n){
    if(a[n]>0) return a[n];
    if(n==1 || n==2) return a[n]=1;
    else return a[n]= fibmem(n-1)+ fibmem(n-2);
}


//PRINT NEW ARRAY
 public void printArray(int[] b){
    for(int k=0; k<b.length;k++){
        System.out.println(b[k]);
    }
 }


//PRINT LIST NODES
public void showList() {
    if (head == null) {
        System.out.print("empty list");
    } else {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.value + " ");
        }
    }
}

}
