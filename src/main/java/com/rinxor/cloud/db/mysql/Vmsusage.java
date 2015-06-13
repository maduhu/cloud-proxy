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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author TJ
 */
@Entity
@Table(name = "vmsusage")
@NamedQueries({
    @NamedQuery(name = "Vmsusage.findAll", query = "SELECT v FROM Vmsusage v"),
    @NamedQuery(name = "Vmsusage.findById", query = "SELECT v FROM Vmsusage v WHERE v.id = :id"),
    @NamedQuery(name = "Vmsusage.findByVmid", query = "SELECT v FROM Vmsusage v WHERE v.vmid = :vmid"),
    @NamedQuery(name = "Vmsusage.findByVmidOrderByUpdated", query = "SELECT v FROM Vmsusage v WHERE v.vmid = :vmid ORDER BY v.updated"),
    @NamedQuery(name = "Vmsusage.findByUpdated", query = "SELECT v FROM Vmsusage v WHERE v.updated = :updated"),
    @NamedQuery(name = "Vmsusage.findByCpuused", query = "SELECT v FROM Vmsusage v WHERE v.cpuused = :cpuused"),
    @NamedQuery(name = "Vmsusage.findByDiskioread", query = "SELECT v FROM Vmsusage v WHERE v.diskioread = :diskioread"),
    @NamedQuery(name = "Vmsusage.findByDiskiowrite", query = "SELECT v FROM Vmsusage v WHERE v.diskiowrite = :diskiowrite"),
    @NamedQuery(name = "Vmsusage.findByDiskkbsread", query = "SELECT v FROM Vmsusage v WHERE v.diskkbsread = :diskkbsread"),
    @NamedQuery(name = "Vmsusage.findByDiskkbswrite", query = "SELECT v FROM Vmsusage v WHERE v.diskkbswrite = :diskkbswrite"),
    @NamedQuery(name = "Vmsusage.findByNetworkkbsread", query = "SELECT v FROM Vmsusage v WHERE v.networkkbsread = :networkkbsread"),
    @NamedQuery(name = "Vmsusage.findByNetworkkbswrite", query = "SELECT v FROM Vmsusage v WHERE v.networkkbswrite = :networkkbswrite"),
    @NamedQuery(name = "Vmsusage.findByMemused", query = "SELECT v FROM Vmsusage v WHERE v.memused = :memused"),
    @NamedQuery(name = "Vmsusage.findByUserid", query = "SELECT v FROM Vmsusage v WHERE v.userid = :userid")})
public class Vmsusage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "vmid")
    private String vmid;
    @Basic(optional = false)
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    @Basic(optional = false)
    @Column(name = "cpuused")
    private double cpuused;
    @Basic(optional = false)
    @Column(name = "diskioread")
    private double diskioread;
    @Basic(optional = false)
    @Column(name = "diskiowrite")
    private double diskiowrite;
    @Basic(optional = false)
    @Column(name = "diskkbsread")
    private double diskkbsread;
    @Basic(optional = false)
    @Column(name = "diskkbswrite")
    private double diskkbswrite;
    @Basic(optional = false)
    @Column(name = "networkkbsread")
    private double networkkbsread;
    @Basic(optional = false)
    @Column(name = "networkkbswrite")
    private double networkkbswrite;
    @Basic(optional = false)
    @Column(name = "memused")
    private double memused;
    @Basic(optional = false)
    @Column(name = "userid")
    private String userid;

    public Vmsusage() {
    }

    public Vmsusage(Integer id) {
        this.id = id;
    }

    public Vmsusage(Integer id, String vmid, Date updated, double cpuused, double diskioread, double diskiowrite, double diskkbsread, double diskkbswrite, double networkkbsread, double networkkbswrite, double memused, String userid) {
        this.id = id;
        this.vmid = vmid;
        this.updated = updated;
        this.cpuused = cpuused;
        this.diskioread = diskioread;
        this.diskiowrite = diskiowrite;
        this.diskkbsread = diskkbsread;
        this.diskkbswrite = diskkbswrite;
        this.networkkbsread = networkkbsread;
        this.networkkbswrite = networkkbswrite;
        this.memused = memused;
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVmid() {
        return vmid;
    }

    public void setVmid(String vmid) {
        this.vmid = vmid;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public double getCpuused() {
        return cpuused;
    }

    public void setCpuused(double cpuused) {
        this.cpuused = cpuused;
    }

    public double getDiskioread() {
        return diskioread;
    }

    public void setDiskioread(double diskioread) {
        this.diskioread = diskioread;
    }

    public double getDiskiowrite() {
        return diskiowrite;
    }

    public void setDiskiowrite(double diskiowrite) {
        this.diskiowrite = diskiowrite;
    }

    public double getDiskkbsread() {
        return diskkbsread;
    }

    public void setDiskkbsread(double diskkbsread) {
        this.diskkbsread = diskkbsread;
    }

    public double getDiskkbswrite() {
        return diskkbswrite;
    }

    public void setDiskkbswrite(double diskkbswrite) {
        this.diskkbswrite = diskkbswrite;
    }

    public double getNetworkkbsread() {
        return networkkbsread;
    }

    public void setNetworkkbsread(double networkkbsread) {
        this.networkkbsread = networkkbsread;
    }

    public double getNetworkkbswrite() {
        return networkkbswrite;
    }

    public void setNetworkkbswrite(double networkkbswrite) {
        this.networkkbswrite = networkkbswrite;
    }

    public double getMemused() {
        return memused;
    }

    public void setMemused(double memused) {
        this.memused = memused;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
        if (!(object instanceof Vmsusage)) {
            return false;
        }
        Vmsusage other = (Vmsusage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Vmsusage[ id=" + id + " ]";
    }
    
}
