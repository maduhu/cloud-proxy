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
@Table(name = "serviceoffering")
@NamedQueries({
    @NamedQuery(name = "Serviceoffering.findAll", query = "SELECT s FROM Serviceoffering s"),
    @NamedQuery(name = "Serviceoffering.findByIndex", query = "SELECT s FROM Serviceoffering s WHERE s.index = :index"),
    @NamedQuery(name = "Serviceoffering.findByCpunumber", query = "SELECT s FROM Serviceoffering s WHERE s.cpunumber = :cpunumber"),
    @NamedQuery(name = "Serviceoffering.findByCpuspeed", query = "SELECT s FROM Serviceoffering s WHERE s.cpuspeed = :cpuspeed"),
    @NamedQuery(name = "Serviceoffering.findByCreated", query = "SELECT s FROM Serviceoffering s WHERE s.created = :created"),
    @NamedQuery(name = "Serviceoffering.findByDefaultuse", query = "SELECT s FROM Serviceoffering s WHERE s.defaultuse = :defaultuse"),
    @NamedQuery(name = "Serviceoffering.findByDisplaytext", query = "SELECT s FROM Serviceoffering s WHERE s.displaytext = :displaytext"),
    @NamedQuery(name = "Serviceoffering.findById", query = "SELECT s FROM Serviceoffering s WHERE s.id = :id"),
    @NamedQuery(name = "Serviceoffering.findByIssystem", query = "SELECT s FROM Serviceoffering s WHERE s.issystem = :issystem"),
    @NamedQuery(name = "Serviceoffering.findByIsvolatile", query = "SELECT s FROM Serviceoffering s WHERE s.isvolatile = :isvolatile"),
    @NamedQuery(name = "Serviceoffering.findByLimitcpuuse", query = "SELECT s FROM Serviceoffering s WHERE s.limitcpuuse = :limitcpuuse"),
    @NamedQuery(name = "Serviceoffering.findByMemory", query = "SELECT s FROM Serviceoffering s WHERE s.memory = :memory"),
    @NamedQuery(name = "Serviceoffering.findByName", query = "SELECT s FROM Serviceoffering s WHERE s.name = :name"),
    @NamedQuery(name = "Serviceoffering.findByNetworkrate", query = "SELECT s FROM Serviceoffering s WHERE s.networkrate = :networkrate"),
    @NamedQuery(name = "Serviceoffering.findByOfferha", query = "SELECT s FROM Serviceoffering s WHERE s.offerha = :offerha"),
    @NamedQuery(name = "Serviceoffering.findByStoragetype", query = "SELECT s FROM Serviceoffering s WHERE s.storagetype = :storagetype")})
public class Serviceoffering implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index")
    private Integer index;
    @Basic(optional = false)
    @Column(name = "cpunumber")
    private int cpunumber;
    @Basic(optional = false)
    @Column(name = "cpuspeed")
    private int cpuspeed;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "defaultuse")
    private boolean defaultuse;
    @Basic(optional = false)
    @Column(name = "displaytext")
    private String displaytext;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "issystem")
    private boolean issystem;
    @Basic(optional = false)
    @Column(name = "isvolatile")
    private boolean isvolatile;
    @Basic(optional = false)
    @Column(name = "limitcpuuse")
    private boolean limitcpuuse;
    @Basic(optional = false)
    @Column(name = "memory")
    private int memory;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "networkrate")
    private int networkrate;
    @Basic(optional = false)
    @Column(name = "offerha")
    private boolean offerha;
    @Basic(optional = false)
    @Column(name = "storagetype")
    private String storagetype;

    public Serviceoffering() {
    }

    public Serviceoffering(Integer index) {
        this.index = index;
    }

    public Serviceoffering(Integer index, int cpunumber, int cpuspeed, Date created, boolean defaultuse, String displaytext, String id, boolean issystem, boolean isvolatile, boolean limitcpuuse, int memory, String name, int networkrate, boolean offerha, String storagetype) {
        this.index = index;
        this.cpunumber = cpunumber;
        this.cpuspeed = cpuspeed;
        this.created = created;
        this.defaultuse = defaultuse;
        this.displaytext = displaytext;
        this.id = id;
        this.issystem = issystem;
        this.isvolatile = isvolatile;
        this.limitcpuuse = limitcpuuse;
        this.memory = memory;
        this.name = name;
        this.networkrate = networkrate;
        this.offerha = offerha;
        this.storagetype = storagetype;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public int getCpunumber() {
        return cpunumber;
    }

    public void setCpunumber(int cpunumber) {
        this.cpunumber = cpunumber;
    }

    public int getCpuspeed() {
        return cpuspeed;
    }

    public void setCpuspeed(int cpuspeed) {
        this.cpuspeed = cpuspeed;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean getDefaultuse() {
        return defaultuse;
    }

    public void setDefaultuse(boolean defaultuse) {
        this.defaultuse = defaultuse;
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

    public boolean getIssystem() {
        return issystem;
    }

    public void setIssystem(boolean issystem) {
        this.issystem = issystem;
    }

    public boolean getIsvolatile() {
        return isvolatile;
    }

    public void setIsvolatile(boolean isvolatile) {
        this.isvolatile = isvolatile;
    }

    public boolean getLimitcpuuse() {
        return limitcpuuse;
    }

    public void setLimitcpuuse(boolean limitcpuuse) {
        this.limitcpuuse = limitcpuuse;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetworkrate() {
        return networkrate;
    }

    public void setNetworkrate(int networkrate) {
        this.networkrate = networkrate;
    }

    public boolean getOfferha() {
        return offerha;
    }

    public void setOfferha(boolean offerha) {
        this.offerha = offerha;
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
        if (!(object instanceof Serviceoffering)) {
            return false;
        }
        Serviceoffering other = (Serviceoffering) object;
        if ((this.index == null && other.index != null) || (this.index != null && !this.index.equals(other.index))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Serviceoffering[ index=" + index + " ]";
    }
    
}
