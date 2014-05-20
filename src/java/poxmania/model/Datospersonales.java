/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author S
 */
@Entity
@Table(name = "DATOSPERSONALES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datospersonales.findAll", query = "SELECT d FROM Datospersonales d"),
    @NamedQuery(name = "Datospersonales.findByIdpedido", query = "SELECT d FROM Datospersonales d WHERE d.idpedido = :idpedido"),
    @NamedQuery(name = "Datospersonales.findByNombre", query = "SELECT d FROM Datospersonales d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Datospersonales.findByDireccion", query = "SELECT d FROM Datospersonales d WHERE d.direccion = :direccion"),
    @NamedQuery(name = "Datospersonales.findByTelefono", query = "SELECT d FROM Datospersonales d WHERE d.telefono = :telefono")})
public class Datospersonales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPEDIDO")
    private Integer idpedido;
    @Size(max = 200)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 600)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 30)
    @Column(name = "TELEFONO")
    private String telefono;

    public Datospersonales() {
    }

    public Datospersonales(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Integer getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedido != null ? idpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datospersonales)) {
            return false;
        }
        Datospersonales other = (Datospersonales) object;
        if ((this.idpedido == null && other.idpedido != null) || (this.idpedido != null && !this.idpedido.equals(other.idpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "poxmania.model.Datospersonales[ idpedido=" + idpedido + " ]";
    }
    
}
