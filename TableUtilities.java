 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                int x=i*j;
                
                sb.append(String.format("%3d |",x)); 
            }
            sb.append("\n");
            
        }
        
        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder buil = new StringBuilder();
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                int x=i*j;
                 
                buil.append(String.format("%3d |",x));
            }
            buil.append("\n");
            
        }
        
        return buil.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder buil = new StringBuilder();
        for(int i=1;i<=tableSize;i++)
        {
            for(int j=1;j<=tableSize;j++)
            {
                int x=i*j;
                 
                buil.append(String.format("%3d |",x));
            }
            buil.append("\n");
            
        }
        
        return buil.toString();
    }
}
