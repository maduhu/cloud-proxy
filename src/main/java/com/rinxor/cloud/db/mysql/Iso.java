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
import javax.persistence.Lob;
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
@Table(name = "iso")
@NamedQueries({
    @NamedQuery(name = "Iso.findAll", query = "SELECT i FROM Iso i"),
    @NamedQuery(name = "Iso.findByIndex", query = "SELECT i FROM Iso i WHERE i.index = :index"),
    @NamedQuery(name = "Iso.findByAccount", query = "SELECT i FROM Iso i WHERE i.account = :account"),
    @NamedQuery(name = "Iso.findByBootable", query = "SELECT i FROM Iso i WHERE i.bootable = :bootable"),
    @NamedQuery(name = "Iso.findByChecksum", query = "SELECT i FROM Iso i WHERE i.checksum = :checksum"),
    @NamedQuery(name = "Iso.findByCreated", query = "SELECT i FROM Iso i WHERE i.created = :created"),
    @NamedQuery(name = "Iso.findByCrossZones", query = "SELECT i FROM Iso i WHERE i.crossZones = :crossZones"),
    @NamedQuery(name = "Iso.findByDisplaytext", query = "SELECT i FROM Iso i WHERE i.displaytext = :displaytext"),
    @NamedQuery(name = "Iso.findByDomain", query = "SELECT i FROM Iso i WHERE i.domain = :domain"),
    @NamedQuery(name = "Iso.findByDomainid", query = "SELECT i FROM Iso i WHERE i.domainid = :domainid"),
    @NamedQuery(name = "Iso.findById", query = "SELECT i FROM Iso i WHERE i.id = :id"),
    @NamedQuery(name = "Iso.findByIsextractable", query = "SELECT i FROM Iso i WHERE i.isextractable = :isextractable"),
    @NamedQuery(name = "Iso.findByIsfeatured", query = "SELECT i FROM Iso i WHERE i.isfeatured = :isfeatured"),
    @NamedQuery(name = "Iso.findByIspublic", query = "SELECT i FROM Iso i WHERE i.ispublic = :ispublic"),
    @NamedQuery(name = "Iso.findByIsready", query = "SELECT i FROM Iso i WHERE i.isready = :isready"),
    @NamedQuery(name = "Iso.findByName", query = "SELECT i FROM Iso i WHERE i.name = :name"),
    @NamedQuery(name = "Iso.findByOstypeid", query = "SELECT i FROM Iso i WHERE i.ostypeid = :ostypeid"),
    @NamedQuery(name = "Iso.findByOstypename", query = "SELECT i FROM Iso i WHERE i.ostypename = :ostypename"),
    @NamedQuery(name = "Iso.findBySize", query = "SELECT i FROM Iso i WHERE i.size = :size"),
    @NamedQuery(name = "Iso.findByStatus", query = "SELECT i FROM Iso i WHERE i.status = :status"),
    @NamedQuery(name = "Iso.findByZoneid", query = "SELECT i FROM Iso i WHERE i.zoneid = :zoneid"),
    @NamedQuery(name = "Iso.findByZonename", query = "SELECT i FROM Iso i WHERE i.zonename = :zonename")})
public class Iso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index")
    private Integer index;
    @Basic(optional = false)
    @Column(name = "account")
    private String account;
    @Basic(optional = false)
    @Column(name = "bootable")
    private boolean bootable;
    @Basic(optional = false)
    @Column(name = "checksum")
    private String checksum;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "crossZones")
    private boolean crossZones;
    @Basic(optional = false)
    @Column(name = "displaytext")
    private String displaytext;
    @Basic(optional = false)
    @Column(name = "domain")
    private String domain;
    @Basic(optional = false)
    @Column(name = "domainid")
    private String domainid;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "isextractable")
    private boolean isextractable;
    @Basic(optional = false)
    @Column(name = "isfeatured")
    private boolean isfeatured;
    @Basic(optional = false)
    @Column(name = "ispublic")
    private boolean ispublic;
    @Basic(optional = false)
    @Column(name = "isready")
    private boolean isready;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "ostypeid")
    private String ostypeid;
    @Basic(optional = false)
    @Column(name = "ostypename")
    private String ostypename;
    @Basic(optional = false)
    @Column(name = "size")
    private int size;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Lob
    @Column(name = "tags")
    private String tags;
    @Basic(optional = false)
    @Column(name = "zoneid")
    private String zoneid;
    @Basic(optional = false)
    @Column(name = "zonename")
    private String zonename;

    public Iso() {
    }

    public Iso(Integer index) {
        this.index = index;
    }

    public Iso(Integer index, String account, boolean bootable, String checksum, Date created, boolean crossZones, String displaytext, String domain, String domainid, String id, boolean isextractable, boolean isfeatured, boolean ispublic, boolean isready, String name, String ostypeid, String ostypename, int size, String status, String zoneid, String zonename) {
        this.index = index;
        this.account = account;
        this.bootable = bootable;
        this.checksum = checksum;
        this.created = created;
        this.crossZones = crossZones;
        this.displaytext = displaytext;
        this.domain = domain;
        this.domainid = domainid;
        this.id = id;
        this.isextractable = isextractable;
        this.isfeatured = isfeatured;
        this.ispublic = ispublic;
        this.isready = isready;
        this.name = name;
        this.ostypeid = ostypeid;
        this.ostypename = ostypename;
        this.size = size;
        this.status = status;
        this.zoneid = zoneid;
        this.zonename = zonename;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public boolean getBootable() {
        return bootable;
    }

    public void setBootable(boolean bootable) {
        this.bootable = bootable;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean getCrossZones() {
        return crossZones;
    }

    public void setCrossZones(boolean crossZones) {
        this.crossZones = crossZones;
    }

    public String getDisplaytext() {
        return displaytext;
    }

    public void setDisplaytext(String displaytext) {
        this.displaytext = displaytext;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsextractable() {
        return isextractable;
    }

    public void setIsextractable(boolean isextractable) {
        this.isextractable = isextractable;
    }

    public boolean getIsfeatured() {
        return isfeatured;
    }

    public void setIsfeatured(boolean isfeatured) {
        this.isfeatured = isfeatured;
    }

    public boolean getIspublic() {
        return ispublic;
    }

    public void setIspublic(boolean ispublic) {
        this.ispublic = ispublic;
    }

    public boolean getIsready() {
        return isready;
    }

    public void setIsready(boolean isready) {
        this.isready = isready;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOstypeid() {
        return ostypeid;
    }

    public void setOstypeid(String ostypeid) {
        this.ostypeid = ostypeid;
    }

    public String getOstypename() {
        return ostypename;
    }

    public void setOstypename(String ostypename) {
        this.ostypename = ostypename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getZoneid() {
        return zoneid;
    }

    public void setZoneid(String zoneid) {
        this.zoneid = zoneid;
    }

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename;
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
        if (!(object instanceof Iso)) {
            return false;
        }
        Iso other = (Iso) object;
        if ((this.index == null && other.index != null) || (this.index != null && !this.index.equals(other.index))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Iso[ index=" + index + " ]";
    }
    
}
