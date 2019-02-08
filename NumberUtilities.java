

import java.lang.*;

public class NumberUtilities {

    public static String getRange(int stop) {
        
        String st = "";
        int i;
        
        for (i=0; i<stop; i++){
            st = st+i;
        }
    
        return st;
    
    }

    public static String getRange(int start, int stop) {
        
        
        String st = "";
        int i;
        
        for (i=start; i<stop; i++){
            st = st+i;
        }
    
        return st;
    }


    public static String getRange(int start, int stop, int step) {
        String st = "";
        int i;
        
        for (i=start; i<stop; i+=step){
            st = st+i;
        }
    
        return st;
    }

    public static  String getEvenNumbers(int start, int stop) {
        String even ="";
        int i;
        for (i=start; i<stop; i++){
            if(i % 2 == 0){
                even = even+i;
            }
            
        }
       
        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd ="";
        int i;
        for (i=start; i<stop; i++){
            if(i % 2 != 0){
                odd = odd+i;
            }
            
        }
       
        return odd;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder sp=new StringBuilder();
        for(int i=start;i<=stop;i++)
        {
            int k=(int)(Math.pow(i, exponent));
                
                sp.append(k);
                
        }

        return sp.toString();
        
    }
}
