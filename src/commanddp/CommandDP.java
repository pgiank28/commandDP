/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddp;

import java.util.*;

public class CommandDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating some requests
        insertRequest req1 = new insertRequest("Employees",5);
        req1.setValue(1, "1");
        req1.setValue(2,"Giannis");
        req1.setValue(3,"Kapoios");
        req1.setValue(4,"Manager");
        req1.setValue(5,"100000");
        
        insertRequest req2 = new insertRequest("Employees",5);
        req2.setValue(1, "2");
        req2.setValue(2,"Eleni");
        req2.setValue(3,"Tyxaia");
        req2.setValue(4,"Engineer");
        req2.setValue(5,"77700");
        
        deleteRequest req3 = new deleteRequest("1","Employees");
        
        // Execute the requests by using the command design pattern.
        List<executeQuery> queries = new ArrayList<executeQuery>();
        
        // Create one insert and one delete requests
        insertInvoker invokerI=new insertInvoker();
        deleteInvoker invokerD=new deleteInvoker();
        invokerI.setRequest(req2);
        invokerD.setRequest(req3);
        
        // Add them to the queries arraylist
        queries.add(invokerI);
        queries.add(invokerD);
        
        // Call the queries without knowing their implemenation
        queries.forEach(q->q.execute());
        
        // Create another insert request and store it
        invokerI.setRequest(req1);
        queries.set(0,invokerI);
        
        // Call the new query together with the old ones
        queries.forEach(q->q.execute());
    }
    
}
