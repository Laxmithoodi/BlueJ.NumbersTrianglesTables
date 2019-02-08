 import java.lang.*;
 import java.util.*;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder star=new StringBuilder();
        for(int i=0;i<numberOfStars;i++)
        {

            star.append('*');

        }

        return star.toString();
        
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder buil = new StringBuilder();
        for(int x=1;x<=numberOfRows;x++)
        {
            String k= getRow(x);
            buil.append(k+"\n");
            
        }
        
        return buil.toString();
    }


    public static String getSmallTriangle() {
        StringBuilder buil = new StringBuilder();
        for(int x=1;x<=4;x++)
        {
            String k= getRow(x);
            buil.append(k+"\n");
            
        }
        
        return buil.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder buil = new StringBuilder();
        for(int x=1;x<=9;x++)
        {
            String k= getRow(x);
            buil.append(k+"\n");
            
        }
        
        return buil.toString();
    }
}
