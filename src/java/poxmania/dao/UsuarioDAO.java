/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.dao;

import org.springframework.stereotype.Component;
import poxmania.model.Usuario;

/**
 *
 * @autores: Samuel Martin y Juan Antonio Echeverrias 
 */

@Component
public class UsuarioDAO extends GeneralDAO <Usuario, Integer>{
    
    public UsuarioDAO (){
        super();
    }
    
}
