/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoUIEscritorio;

import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Usuario;

/**
 *
 * @author tomas
 */
public class LoginGestor extends Login{
    
    @Override
    public Usuario Logear(String usuario, String pwd) {
        return Fachada.getInstancia().loginGestor(usuario, pwd);
    }

    @Override
    public void proxCasoUso(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
