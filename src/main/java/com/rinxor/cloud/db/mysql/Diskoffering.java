/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rinxor.cloud.db.mysql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jampajeen
 */
@Entity
@Table(name = "diskoffering")
@NamedQueries({
    @NamedQuery(name = "Diskoffering.findAll", query = "SELECT d FROM Diskoffering d"),
    @NamedQuery(name = "Diskoffering.findByIndex", query = "SELECT d FROM Diskoffering d WHERE d.index = :index"),
    @NamedQuery(name = "Diskoffering.findByCreated", query = "SELECT d FROM Diskoffering d WHERE d.created = :created"),
    @NamedQuery(name = "Diskoffering.findByDisksize", query = "SELECT d FROM Diskoffering d WHERE d.disksize = :disksize"),
    @NamedQuery(name = "Diskoffering.findByDisplayoffering", query = "SELECT d FROM Diskoffering d WHERE d.displayoffering = :displayoffering"),
    @NamedQuery(name = "Diskoffering.findByDisplaytext", query = "SELECT d FROM Diskoffering d WHERE d.displaytext = :displaytext"),
    @NamedQuery(name = "Diskoffering.findById", query = "SELECT d FROM Diskoffering d WHERE d.id = :id"),
    @NamedQuery(name = "Diskoffering.findByIscustomized", query = "SELECT d FROM Diskoffering d WHERE d.iscustomized = :iscustomized"),
    @NamedQuery(name = "Diskoffering.findByName", query = "SELECT d FROM Diskoffering d WHERE d.name = :name"),
    @NamedQuery(name = "Diskoffering.findByStoragetype", query = "SELECT d FROM Diskoffering d WHERE d.storagetype = :storagetype")})
public class Diskoffering implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index")
    private Integer index;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "disksize")
    private int disksize;
    @Basic(optional = false)
    @Column(name = "displayoffering")
    private boolean displayoffering;
    @Basic(optional = false)
    @Column(name = "displaytext")
    private String displaytext;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "iscustomized")
    private boolean iscustomized;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "storagetype")
    private String storagetype;

    public Diskoffering() {
    }

    public Diskoffering(Integer index) {
        this.index = index;
    }

    public Diskoffering(Integer index, Date created, int disksize, boolean displayoffering, String displaytext, String id, boolean iscustomized, String name, String storagetype) {
        this.index = index;
        this.created = created;
        this.disksize = disksize;
        this.displayoffering = displayoffering;
        this.displaytext = displaytext;
        this.id = id;
        this.iscustomized = iscustomized;
        this.name = name;
        this.storagetype = storagetype;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getDisksize() {
        return disksize;
    }

    public void setDisksize(int disksize) {
        this.disksize = disksize;
    }

    public boolean getDisplayoffering() {
        return displayoffering;
    }

    public void setDisplayoffering(boolean displayoffering) {
        this.displayoffering = displayoffering;
    }

    public String getDisplaytext() {
        return displaytext;
    }

    public void setDisplaytext(String displaytext) {
        this.displaytext = displaytext;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIscustomized() {
        return iscustomized;
    }

    public void setIscustomized(boolean iscustomized) {
        this.iscustomized = iscustomized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoragetype() {
        return storagetype;
    }

    public void setStoragetype(String storagetype) {
        this.storagetype = storagetype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (index != null ? index.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diskoffering)) {
            return false;
        }
        Diskoffering other = (Diskoffering) object;
        if ((this.index == null && other.index != null) || (this.index != null && !this.index.equals(other.index))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Diskoffering[ index=" + index + " ]";
    }
    
}
