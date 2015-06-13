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
 * @author TJ
 */
@Entity
@Table(name = "vmsusageday")
@NamedQueries({
    @NamedQuery(name = "Vmsusageday.findAll", query = "SELECT v FROM Vmsusageday v"),
    @NamedQuery(name = "Vmsusageday.findById", query = "SELECT v FROM Vmsusageday v WHERE v.id = :id"),
    @NamedQuery(name = "Vmsusageday.findByVmid", query = "SELECT v FROM Vmsusageday v WHERE v.vmid = :vmid"),
    @NamedQuery(name = "Vmsusageday.findByUpdated", query = "SELECT v FROM Vmsusageday v WHERE v.updated = :updated"),
    @NamedQuery(name = "Vmsusageday.findByCpuused", query = "SELECT v FROM Vmsusageday v WHERE v.cpuused = :cpuused"),
    @NamedQuery(name = "Vmsusageday.findByDiskioread", query = "SELECT v FROM Vmsusageday v WHERE v.diskioread = :diskioread"),
    @NamedQuery(name = "Vmsusageday.findByDiskiowrite", query = "SELECT v FROM Vmsusageday v WHERE v.diskiowrite = :diskiowrite"),
    @NamedQuery(name = "Vmsusageday.findByDiskkbsread", query = "SELECT v FROM Vmsusageday v WHERE v.diskkbsread = :diskkbsread"),
    @NamedQuery(name = "Vmsusageday.findByDiskkbswrite", query = "SELECT v FROM Vmsusageday v WHERE v.diskkbswrite = :diskkbswrite"),
    @NamedQuery(name = "Vmsusageday.findByNetworkkbsread", query = "SELECT v FROM Vmsusageday v WHERE v.networkkbsread = :networkkbsread"),
    @NamedQuery(name = "Vmsusageday.findByNetworkkbswrite", query = "SELECT v FROM Vmsusageday v WHERE v.networkkbswrite = :networkkbswrite"),
    @NamedQuery(name = "Vmsusageday.findByMemused", query = "SELECT v FROM Vmsusageday v WHERE v.memused = :memused"),
    @NamedQuery(name = "Vmsusageday.findByUserid", query = "SELECT v FROM Vmsusageday v WHERE v.userid = :userid"),
    @NamedQuery(name = "Vmsusageday.findByNumcount", query = "SELECT v FROM Vmsusageday v WHERE v.numcount = :numcount")})
public class Vmsusageday implements Serializable {
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
    @Basic(optional = false)
    @Column(name = "numcount")
    private int numcount;

    public Vmsusageday() {
    }

    public Vmsusageday(Integer id) {
        this.id = id;
    }

    public Vmsusageday(Integer id, String vmid, Date updated, double cpuused, double diskioread, double diskiowrite, double diskkbsread, double diskkbswrite, double networkkbsread, double networkkbswrite, double memused, String userid, int numcount) {
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
        this.numcount = numcount;
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

    public int getNumcount() {
        return numcount;
    }

    public void setNumcount(int numcount) {
        this.numcount = numcount;
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
        if (!(object instanceof Vmsusageday)) {
            return false;
        }
        Vmsusageday other = (Vmsusageday) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Vmsusageday[ id=" + id + " ]";
    }
    
}
