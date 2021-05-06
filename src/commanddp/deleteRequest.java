/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddp;


public class deleteRequest {
    private String tableName;
    private String rowPrimaryKey;
    
    public deleteRequest(String id,String tableName){
        this.tableName=tableName;
        this.rowPrimaryKey=id;
    }

    public String getTableName() {
        return tableName;
    }

    public String getRowPrimaryKey() {
        return rowPrimaryKey;
    }    
}
