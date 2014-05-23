/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poxmania.dao;

import org.springframework.stereotype.Component;
import poxmania.model.Categoria;
@Component
public class CategoriaDAO extends GeneralDAO<Categoria,Integer> {

    public CategoriaDAO(){
        super();
    }

}//fin clase
