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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jampajeen
 */
@Entity
@Table(name = "networkoffering")
@NamedQueries({
    @NamedQuery(name = "Networkoffering.findAll", query = "SELECT n FROM Networkoffering n"),
    @NamedQuery(name = "Networkoffering.findByIndex", query = "SELECT n FROM Networkoffering n WHERE n.index = :index"),
    @NamedQuery(name = "Networkoffering.findByAvailability", query = "SELECT n FROM Networkoffering n WHERE n.availability = :availability"),
    @NamedQuery(name = "Networkoffering.findByConservemode", query = "SELECT n FROM Networkoffering n WHERE n.conservemode = :conservemode"),
    @NamedQuery(name = "Networkoffering.findByDisplaytext", query = "SELECT n FROM Networkoffering n WHERE n.displaytext = :displaytext"),
    @NamedQuery(name = "Networkoffering.findByEgressdefaultpolicy", query = "SELECT n FROM Networkoffering n WHERE n.egressdefaultpolicy = :egressdefaultpolicy"),
    @NamedQuery(name = "Networkoffering.findByForvpc", query = "SELECT n FROM Networkoffering n WHERE n.forvpc = :forvpc"),
    @NamedQuery(name = "Networkoffering.findByGuestiptype", query = "SELECT n FROM Networkoffering n WHERE n.guestiptype = :guestiptype"),
    @NamedQuery(name = "Networkoffering.findById", query = "SELECT n FROM Networkoffering n WHERE n.id = :id"),
    @NamedQuery(name = "Networkoffering.findByIsdefault", query = "SELECT n FROM Networkoffering n WHERE n.isdefault = :isdefault"),
    @NamedQuery(name = "Networkoffering.findByIspersistent", query = "SELECT n FROM Networkoffering n WHERE n.ispersistent = :ispersistent"),
    @NamedQuery(name = "Networkoffering.findByName", query = "SELECT n FROM Networkoffering n WHERE n.name = :name"),
    @NamedQuery(name = "Networkoffering.findByNetworkrate", query = "SELECT n FROM Networkoffering n WHERE n.networkrate = :networkrate"),
    @NamedQuery(name = "Networkoffering.findByServiceofferingid", query = "SELECT n FROM Networkoffering n WHERE n.serviceofferingid = :serviceofferingid"),
    @NamedQuery(name = "Networkoffering.findBySpecifyipranges", query = "SELECT n FROM Networkoffering n WHERE n.specifyipranges = :specifyipranges"),
    @NamedQuery(name = "Networkoffering.findBySpecifyvlan", query = "SELECT n FROM Networkoffering n WHERE n.specifyvlan = :specifyvlan"),
    @NamedQuery(name = "Networkoffering.findByState", query = "SELECT n FROM Networkoffering n WHERE n.state = :state"),
    @NamedQuery(name = "Networkoffering.findByTraffictype", query = "SELECT n FROM Networkoffering n WHERE n.traffictype = :traffictype")})
public class Networkoffering implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index")
    private Integer index;
    @Basic(optional = false)
    @Column(name = "availability")
    private String availability;
    @Basic(optional = false)
    @Column(name = "conservemode")
    private boolean conservemode;
    @Basic(optional = false)
    @Column(name = "displaytext")
    private String displaytext;
    @Basic(optional = false)
    @Column(name = "egressdefaultpolicy")
    private boolean egressdefaultpolicy;
    @Basic(optional = false)
    @Column(name = "forvpc")
    private boolean forvpc;
    @Basic(optional = false)
    @Column(name = "guestiptype")
    private String guestiptype;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "isdefault")
    private boolean isdefault;
    @Basic(optional = false)
    @Column(name = "ispersistent")
    private boolean ispersistent;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "networkrate")
    private int networkrate;
    @Basic(optional = false)
    @Lob
    @Column(name = "service")
    private String service;
    @Basic(optional = false)
    @Column(name = "serviceofferingid")
    private String serviceofferingid;
    @Basic(optional = false)
    @Column(name = "specifyipranges")
    private boolean specifyipranges;
    @Basic(optional = false)
    @Column(name = "specifyvlan")
    private boolean specifyvlan;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "traffictype")
    private String traffictype;

    public Networkoffering() {
    }

    public Networkoffering(Integer index) {
        this.index = index;
    }

    public Networkoffering(Integer index, String availability, boolean conservemode, String displaytext, boolean egressdefaultpolicy, boolean forvpc, String guestiptype, String id, boolean isdefault, boolean ispersistent, String name, int networkrate, String service, String serviceofferingid, boolean specifyipranges, boolean specifyvlan, String state, String traffictype) {
        this.index = index;
        this.availability = availability;
        this.conservemode = conservemode;
        this.displaytext = displaytext;
        this.egressdefaultpolicy = egressdefaultpolicy;
        this.forvpc = forvpc;
        this.guestiptype = guestiptype;
        this.id = id;
        this.isdefault = isdefault;
        this.ispersistent = ispersistent;
        this.name = name;
        this.networkrate = networkrate;
        this.service = service;
        this.serviceofferingid = serviceofferingid;
        this.specifyipranges = specifyipranges;
        this.specifyvlan = specifyvlan;
        this.state = state;
        this.traffictype = traffictype;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public boolean getConservemode() {
        return conservemode;
    }

    public void setConservemode(boolean conservemode) {
        this.conservemode = conservemode;
    }

    public String getDisplaytext() {
        return displaytext;
    }

    public void setDisplaytext(String displaytext) {
        this.displaytext = displaytext;
    }

    public boolean getEgressdefaultpolicy() {
        return egressdefaultpolicy;
    }

    public void setEgressdefaultpolicy(boolean egressdefaultpolicy) {
        this.egressdefaultpolicy = egressdefaultpolicy;
    }

    public boolean getForvpc() {
        return forvpc;
    }

    public void setForvpc(boolean forvpc) {
        this.forvpc = forvpc;
    }

    public String getGuestiptype() {
        return guestiptype;
    }

    public void setGuestiptype(String guestiptype) {
        this.guestiptype = guestiptype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }

    public boolean getIspersistent() {
        return ispersistent;
    }

    public void setIspersistent(boolean ispersistent) {
        this.ispersistent = ispersistent;
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceofferingid() {
        return serviceofferingid;
    }

    public void setServiceofferingid(String serviceofferingid) {
        this.serviceofferingid = serviceofferingid;
    }

    public boolean getSpecifyipranges() {
        return specifyipranges;
    }

    public void setSpecifyipranges(boolean specifyipranges) {
        this.specifyipranges = specifyipranges;
    }

    public boolean getSpecifyvlan() {
        return specifyvlan;
    }

    public void setSpecifyvlan(boolean specifyvlan) {
        this.specifyvlan = specifyvlan;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTraffictype() {
        return traffictype;
    }

    public void setTraffictype(String traffictype) {
        this.traffictype = traffictype;
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
        if (!(object instanceof Networkoffering)) {
            return false;
        }
        Networkoffering other = (Networkoffering) object;
        if ((this.index == null && other.index != null) || (this.index != null && !this.index.equals(other.index))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Networkoffering[ index=" + index + " ]";
    }
    
}
