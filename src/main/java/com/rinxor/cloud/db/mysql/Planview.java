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
@Table(name = "planview")
@NamedQueries({
    @NamedQuery(name = "Planview.findAll", query = "SELECT p FROM Planview p"),
    @NamedQuery(name = "Planview.findByPlanid", query = "SELECT p FROM Planview p WHERE p.planid = :planid"),
    @NamedQuery(name = "Planview.findByName", query = "SELECT p FROM Planview p WHERE p.name = :name"),
    @NamedQuery(name = "Planview.findByDescription", query = "SELECT p FROM Planview p WHERE p.description = :description"),
    @NamedQuery(name = "Planview.findByCpunumber", query = "SELECT p FROM Planview p WHERE p.cpunumber = :cpunumber"),
    @NamedQuery(name = "Planview.findByCpu", query = "SELECT p FROM Planview p WHERE p.cpu = :cpu"),
    @NamedQuery(name = "Planview.findByRam", query = "SELECT p FROM Planview p WHERE p.ram = :ram"),
    @NamedQuery(name = "Planview.findByStorage", query = "SELECT p FROM Planview p WHERE p.storage = :storage"),
    @NamedQuery(name = "Planview.findByIp", query = "SELECT p FROM Planview p WHERE p.ip = :ip"),
    @NamedQuery(name = "Planview.findByBandwidth", query = "SELECT p FROM Planview p WHERE p.bandwidth = :bandwidth"),
    @NamedQuery(name = "Planview.findByTransfer", query = "SELECT p FROM Planview p WHERE p.transfer = :transfer"),
    @NamedQuery(name = "Planview.findByOs", query = "SELECT p FROM Planview p WHERE p.os = :os"),
    @NamedQuery(name = "Planview.findByAppliance", query = "SELECT p FROM Planview p WHERE p.appliance = :appliance"),
    @NamedQuery(name = "Planview.findByTemplatecode", query = "SELECT p FROM Planview p WHERE p.templatecode = :templatecode"),
    @NamedQuery(name = "Planview.findByZoneid", query = "SELECT p FROM Planview p WHERE p.zoneid = :zoneid"),
    @NamedQuery(name = "Planview.findByZoneidAndTemplatecode", query = "SELECT p FROM Planview p WHERE p.zoneid = :zoneid AND p.templatecode = :templatecode"),
    @NamedQuery(name = "Planview.findByZonename", query = "SELECT p FROM Planview p WHERE p.zonename = :zonename")})
public class Planview implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "planid")
    @Id
    private int planid;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "cpunumber")
    private int cpunumber;
    @Basic(optional = false)
    @Column(name = "cpu")
    private int cpu;
    @Basic(optional = false)
    @Column(name = "ram")
    private int ram;
    @Basic(optional = false)
    @Column(name = "storage")
    private int storage;
    @Basic(optional = false)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "bandwidth")
    private int bandwidth;
    @Basic(optional = false)
    @Column(name = "transfer")
    private String transfer;
    @Basic(optional = false)
    @Column(name = "os")
    private String os;
    @Basic(optional = false)
    @Column(name = "appliance")
    private String appliance;
    @Basic(optional = false)
    @Column(name = "templatecode")
    private String templatecode;
    @Basic(optional = false)
    @Column(name = "zoneid")
    private String zoneid;
    @Basic(optional = false)
    @Column(name = "zonename")
    private String zonename;

    public Planview() {
    }

    public int getPlanid() {
        return planid;
    }

    public void setPlanid(int planid) {
        this.planid = planid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCpunumber() {
        return cpunumber;
    }

    public void setCpunumber(int cpunumber) {
        this.cpunumber = cpunumber;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getAppliance() {
        return appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    public String getTemplatecode() {
        return templatecode;
    }

    public void setTemplatecode(String templatecode) {
        this.templatecode = templatecode;
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
    
}
