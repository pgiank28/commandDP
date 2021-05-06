/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddp;


public class deleteInvoker implements executeQuery{
    private deleteRequest request;
    
    public void setRequest(deleteRequest request){
        this.request=request;
    }

    @Override
    public void execute() {
        System.out.println("Delete from table "+request.getTableName()+"  the item with id: "+request.getRowPrimaryKey());
    }
    
    
}
