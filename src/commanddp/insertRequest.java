/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddp;
import java.util.*;

public class insertRequest {
    private String tableName;
    private int numberOfColumnsInTable;
    private List<String> valuesToInsert;
    
    public insertRequest(String table,int cols){
        this.tableName = table;
        this.numberOfColumnsInTable=cols;
        this.valuesToInsert=Arrays.asList(new String[cols]);
        
    }
    
    public void setValue(int columnNumber,String value){
        this.valuesToInsert.set(columnNumber-1,value);
    }

    public void addValue(String value){
        this.valuesToInsert.add(value);
    }
    
    public String getTableName() {
        return tableName;
    }

    public String getValuesToInsert() {
        return valuesToInsert.toString();
    }
    
}
