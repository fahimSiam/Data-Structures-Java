package hashing;

public class hashing{
    String hash[] =new String[9];//hash table array
    public hashing(){
        //String [] s = new String[9];
        }
    public void hashTable(String [] k){
        //split the string
        for(int i=0; i<k.length; i++){
            char[] s= k[i].toCharArray();
            int value=hashCalc(s);
            if(hash[value]==null){
                hash[value]=k[i];
            }
            else{
                probing(k[i],value);

            }

        }
        printHashArray();
    }

  
    public void  probing(String s, int value) {
        if(value>8){
            value=0;
        }
        while(hash[value]!=null){
            if(value==8){
                value=0;
            }
            else{
            value++;
            }
        }
        hash[value]=s;
    }

    
    public int hashCalc(char []s){
        int sum=0;
        int cons=0;
        for(int d=0; d<s.length;d++){
            if(s[d]=='0' || s[d]=='1' || s[d]=='2' || s[d]=='3' || s[d]=='4' || s[d]=='5' || s[d]=='6' || s[d]=='7' || s[d]=='8' || s[d]=='9'){
                int a=Character.getNumericValue(s[d]);  
                sum=sum+a;
            }
            else if(s[d]!='A' && s[d]!='E' && s[d]!='I' && s[d]!='O' && s[d]!='U'){
                cons++;
            }
        }
        sum=sum+(cons*24);
        sum=sum%9;
        return sum;
    }

    public void printHashArray() {
        for(int x=0; x<hash.length; x++){
            System.out.println(hash[x]+ " is at index "+ x);
        }
    }

}