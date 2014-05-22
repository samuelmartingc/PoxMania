/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.dao;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import poxmania.model.Producto;
import poxmania.model.Usuario;

/**
 **
 * @autores: Samuel Martin y Juan Antonio Echeverrias 
 */

@Component
public class UsuarioDAO extends GeneralDAO <Usuario, Integer>{
    
    public UsuarioDAO (){
        super();
    }
    
    public Usuario findByNick (String nick){
        this.open();
        TypedQuery <Usuario> query= getManager().createNamedQuery("Usuario.findByNick", Usuario.class);
        query.setParameter("nick", nick);
        List <Usuario> usuarios =  query.getResultList();
        this.close();
        Usuario usuario=null;
        if(!usuarios.isEmpty()){
            usuario = usuarios.get(0);
        }
        
        return usuario;
    }
    
}
