/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.db.mysql;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author TJ
 */
@Entity
@Table(name = "network")
@NamedQueries({
    @NamedQuery(name = "Network.findAll", query = "SELECT n FROM Network n"),
    @NamedQuery(name = "Network.findById", query = "SELECT n FROM Network n WHERE n.id = :id"),
    @NamedQuery(name = "Network.findByName", query = "SELECT n FROM Network n WHERE n.name = :name"),
    @NamedQuery(name = "Network.findByIsdefault", query = "SELECT n FROM Network n WHERE n.isdefault = :isdefault"),
    @NamedQuery(name = "Network.findByType", query = "SELECT n FROM Network n WHERE n.type = :type")})
public class Network implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "isdefault")
    private boolean isdefault;
    @Basic(optional = false)
    @Column(name = "type")
    private int type;

    public Network() {
    }

    public Network(String id) {
        this.id = id;
    }

    public Network(String id, String name, boolean isdefault, int type) {
        this.id = id;
        this.name = name;
        this.isdefault = isdefault;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Network)) {
            return false;
        }
        Network other = (Network) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Network[ id=" + id + " ]";
    }
    
}
