/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

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

/**
 *
 * @author Saimo
 */
@Entity
@Table(name = "clientes")
@NamedQueries({
    @NamedQuery(name = "clientes.findAll", query = "SELECT p FROM clientes p"),
    @NamedQuery(name = "clientes.findByclientes_id", query = "SELECT p FROM clientes p WHERE p.clientes_id = :clientes_id"),
    @NamedQuery(name = "clientes.findByclientes_nombre", query = "SELECT p FROM clientes p WHERE p.clientes_nombre = :clientes_nombre"),
    @NamedQuery(name = "clientes.findByclientes_apellido", query = "SELECT p FROM clientes p WHERE p.clientes_apellido = :clientes_apellido")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "clientes_id")
    private Short clientes_id;
    @Size(max = 250)
    @Column(name = "clientes_nombre")
    private String clientes_nombre;
    @Column(name = "clientes_apellido")
    private String clientes_apellido;

    public Clientes() {
    }

    public Clientes(Short clientes_id) {
        this.clientes_id = clientes_id;
    }

    public Short getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(Short clientes_id) {
        this.clientes_id = clientes_id;
    }

    public String getClientes_nombre() {
        return clientes_nombre;
    }

    public void setClientes_nombre(String clientes_nombre) {
        this.clientes_nombre = clientes_nombre;
    }

    public String getClientes_apellido() {
        return clientes_apellido;
    }

    public void setClientes_apellido(String clientes_apellido) {
        this.clientes_apellido = clientes_apellido;
    }

    @Override
    public int hashCode(){
        int hash = 0;
        hash +=(clientes_id != null ? clientes_id.hashCode() : 0);
        return hash;
}

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.clientes_id == null && other.clientes_id !=null) || (this.clientes_id != null && !this.clientes_id.equals(other.clientes_id))) {
            return false;
        }
        return true;
}

    @Override
    public String toString() {
        return "entities.Clientes[ clientes_id-" + clientes_id + " ]";
    }


}

