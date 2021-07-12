public class assignment2{

//TASK 1
  public int powerN(int n, int p){
    if( p==1) return n;
    else{
      return n* powerN(n, p-1);
    }
  }

//TASK 3
public int hocBuilder(int height){
  if(height==0){
    System.out.println("you do not build a house at all");
    return 0;
  }
  else if(height==1){
    return 8;
  }
    return 5+hocBuilder(height-1);
}


//TASK 3 ulta
public int hocBuilderulta(int height){
  if(height>=8 && height<13){
    return 1;
  }
  else{
   if(height>8){
    return 1+ hocBuilderulta(height-5);
  }
  else{
  return 0;
    }
}
}





public static void main(String[] args){
 assignment2 num = new assignment2();
 //System.out.println( num.powerN(3, 1));
 System.out.println( num.hocBuilder(0));

}


}