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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author TJ
 */
@Entity
@Table(name = "vms")
@NamedQueries({
    @NamedQuery(name = "Vms.findAll", query = "SELECT v FROM Vms v"),
    @NamedQuery(name = "Vms.findById", query = "SELECT v FROM Vms v WHERE v.id = :id"),
    @NamedQuery(name = "Vms.findByUserid", query = "SELECT v FROM Vms v WHERE v.userid = :userid"),
    @NamedQuery(name = "Vms.findByGuestuser", query = "SELECT v FROM Vms v WHERE v.guestuser = :guestuser"),
    @NamedQuery(name = "Vms.findByGuestpassword", query = "SELECT v FROM Vms v WHERE v.guestpassword = :guestpassword")})
public class Vms implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "userid")
    private String userid;
    @Basic(optional = false)
    @Column(name = "guestuser")
    private String guestuser;
    @Basic(optional = false)
    @Column(name = "guestpassword")
    private String guestpassword;
    @Basic(optional = false)
    @Lob
    @Column(name = "vmusage")
    private String vmusage;
    @Basic(optional = false)
    @Lob
    @Column(name = "vmusageminute")
    private String vmusageminute;
    @Basic(optional = false)
    @Lob
    @Column(name = "vmusagehour")
    private String vmusagehour;
    @Basic(optional = false)
    @Lob
    @Column(name = "vmusageday")
    private String vmusageday;

    public Vms() {
    }

    public Vms(String id) {
        this.id = id;
    }

    public Vms(String id, String userid, String guestuser, String guestpassword, String vmusage, String vmusageminute, String vmusagehour, String vmusageday) {
        this.id = id;
        this.userid = userid;
        this.guestuser = guestuser;
        this.guestpassword = guestpassword;
        this.vmusage = vmusage;
        this.vmusageminute = vmusageminute;
        this.vmusagehour = vmusagehour;
        this.vmusageday = vmusageday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGuestuser() {
        return guestuser;
    }

    public void setGuestuser(String guestuser) {
        this.guestuser = guestuser;
    }

    public String getGuestpassword() {
        return guestpassword;
    }

    public void setGuestpassword(String guestpassword) {
        this.guestpassword = guestpassword;
    }

    public String getVmusage() {
        return vmusage;
    }

    public void setVmusage(String vmusage) {
        this.vmusage = vmusage;
    }

    public String getVmusageminute() {
        return vmusageminute;
    }

    public void setVmusageminute(String vmusageminute) {
        this.vmusageminute = vmusageminute;
    }

    public String getVmusagehour() {
        return vmusagehour;
    }

    public void setVmusagehour(String vmusagehour) {
        this.vmusagehour = vmusagehour;
    }

    public String getVmusageday() {
        return vmusageday;
    }

    public void setVmusageday(String vmusageday) {
        this.vmusageday = vmusageday;
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
        if (!(object instanceof Vms)) {
            return false;
        }
        Vms other = (Vms) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Vms[ id=" + id + " ]";
    }
    
}
