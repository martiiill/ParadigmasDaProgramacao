/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoomato;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ppwebservicemanager.WebServiceConnection;

/**
 *
 * @author Ana Martins
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebServiceConnection conn = new WebServiceConnection("be1e2bd34d53e2407f0752107af9e136");
        
        try {
            
            String json = conn.getContent("https://developers.zomato.com/api/v2.1/categories");
            System.out.println(json);            
            
            //from json
            
            /**
             * Categorias categorias = gson.fromjson (json, Categorias.class
             * Array.asList(categorias,getCategorias().stream().forEach
             * 
             */
            
            //to json
            
            
            /**
             * Info c1 = (new Main().new Info(id, name) ; + 1
             * Cateogria cat1 = (new Mai().new Categoria(c1);  + 1
             * 
             * Categorias cs = new Main().new Categorias(new Categira[]
             */
            
            
            //importar gson jar json
            
            /**
             * 
             * 
             * 
             * public class categorias[
             * 
             * y [] categories;
             * }
             * 
             * public class y {
             * 
             * info categories;
             * 
             * 
             * }
             * 
             * 
             * public class info{
             * INT id, string name;
             * }
             * 
             * conversao ------
             * 
             * 
             * 
             * 
             * 
             */
            
        } catch (IOException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
