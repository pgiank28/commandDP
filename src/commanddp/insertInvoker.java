/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddp;


public class insertInvoker implements executeQuery{
    
    private insertRequest request;
    
    public void setRequest(insertRequest request){
        this.request=request;
    }

    @Override
    public void execute() {
        System.out.println("Inserting at "+request.getTableName()+" values:  "+request.getValuesToInsert());
    }
    
    
}
