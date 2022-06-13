/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2resto;

import obligatoriorestoLogica.Bar;
import obligatoriorestoLogica.ClienteCasa;
import obligatoriorestoLogica.ClienteComun;
import obligatoriorestoLogica.ClientePreferencial;
import obligatoriorestoLogica.Cocina;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Mesa;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Producto;
import obligatoriorestoLogica.Servicio;


/**
 *
 * @author admin
 */
public class DatosPrueba {
    
    public static void cargar(){
        Fachada logica = Fachada.getInstancia();
           logica.agregarUnidadProcesadora();
        //USUARIOS MOZOS
        logica.agregarMozo("Juan", "Juan1234","Juan Perez", "099 854 784");
        logica.agregarMozo("Lucas", "Lucas1234","Lucas Perez", "099 854 111");
        logica.agregarMozo("Martin", "Martin1234","Martin Gonzalez", "099 457 549");
        logica.agregarMozo("Sofia", "Sofia1234","Sofia Martinez", "099 222 748");
        logica.agregarMozo("Lucia", "Lucia1234","Lucia Rodriguez", "094 333 487");
        
        Mozo mozo1 = new Mozo("Juan", "Juan1234","Juan Perez", "099 854 784");
        Mozo mozo2 = new Mozo("Lucas", "Lucas1234","Lucas Perez", "099 854 111");
        Mozo mozo3 = new Mozo("Martin", "Martin1234","Martin Gonzalez", "099 457 549");
        Mozo mozo4 = new Mozo("Sofia", "Sofia1234","Sofia Martinez", "099 222 748");
        Mozo mozo5 = new Mozo("Lucia", "Lucia1234","Lucia Rodriguez", "094 333 487");
        
       
        
         //USUARIOS GESTORES
        logica.agregarGestor("Camila", "Camila1234","Camila Perez");
        logica.agregarGestor("x", "x","Camila Perez");
        logica.agregarGestor("Martina", "Martina1234","Martina Gonzalez");
        logica.agregarGestor("Jorge", "Jorge1234","Jorge Martinez");
        
        //CLIENTES PREFERENCIALES
        
        ClientePreferencial clientePref1 = new ClientePreferencial(10,"lucas@rodriguez.com", "Lucas Preferencial");
        ClientePreferencial clientePref2 = new ClientePreferencial(11,"xim@xim.com", "Ximena Preferencial");
        logica.agregarCliente(clientePref1);
        logica.agregarCliente(clientePref2);
        //CLIENTES COMUNES
        
        ClienteComun clienteCom1 = new ClienteComun(12,"jorge@jorge.com", "Jorge Comun");
        ClienteComun clienteCom2 = new ClienteComun(13,"sof@sof.com", "Sofia Comun");
        logica.agregarCliente(clienteCom1);
        logica.agregarCliente(clienteCom2);
        
        //CLIENTES CASA
        
        ClienteCasa clienteCasa1 = new ClienteCasa(14,"martina@mart.com", "Martina Casa");
        ClienteCasa clienteCasa2 = new ClienteCasa(15,"nic@nic.com", "Nicolas Casa");
        logica.agregarCliente(clienteCasa1);
        logica.agregarCliente(clienteCasa2);
        
     
        
        
        //MESAS
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);
        Mesa mesa4 = new Mesa(4);
        Mesa mesa5 = new Mesa(5);
        
        
        
        logica.agregarMesa(mesa1);
        logica.agregarMesa(mesa2);
        logica.agregarMesa(mesa3);
        logica.agregarMesa(mesa4);
        logica.agregarMesa(mesa5);
        
        Bar bar=new Bar("Bar");
        Cocina cocina=new Cocina("Cocina");
        
        //PRODUCTOS
        
        Producto prod1 = new Producto(1,"Hamburgesa", 250,30);
        Producto prod2 = new Producto(2,"Tarta de pollo", 130,15);
        Producto prod3 = new Producto(3,"Milanesa de carne", 180,60);
        Producto prod4 = new Producto(1,"Milanesa de pollo", 220,20);
        Producto prod5 = new Producto(1,"Ravioles", 400,40);
        Producto prod6 = new Producto(1,"Daikiri", 420,20);
        Producto prod7 = new Producto(1,"Fernet", 120,50);
        Producto prod8 = new Producto(1,"Cerveza", 110,30);
        Producto prod9 = new Producto(1,"Vino", 50,30);
        
        prod6.setUnidadProcesadora(bar);
        prod7.setUnidadProcesadora(bar);
        prod8.setUnidadProcesadora(bar);
        prod9.setUnidadProcesadora(bar);
       
         
        prod1.setUnidadProcesadora(cocina);
        prod2.setUnidadProcesadora(cocina);
        prod3.setUnidadProcesadora(cocina);
        prod4.setUnidadProcesadora(cocina);
        prod5.setUnidadProcesadora(cocina);
        
        logica.agregar(prod1);
        logica.agregar(prod2);
        logica.agregar(prod3);
        logica.agregar(prod4);
        logica.agregar(prod5);
        logica.agregar(prod6);
        logica.agregar(prod7);
        logica.agregar(prod8);
        logica.agregar(prod9);
        
        //SERVICIOS 
        
        Servicio serv1 = new Servicio(mesa1,mozo1);
        Servicio serv2 = new Servicio(mesa2,mozo3);
        
        
        
        
        
        
        
       
        
           
        
       
    }
    
}
