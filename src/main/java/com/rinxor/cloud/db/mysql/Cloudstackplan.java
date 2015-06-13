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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author TJ
 */
@Entity
@Table(name = "cloudstackplan")
@NamedQueries({
    @NamedQuery(name = "Cloudstackplan.findAll", query = "SELECT c FROM Cloudstackplan c"),
    @NamedQuery(name = "Cloudstackplan.findById", query = "SELECT c FROM Cloudstackplan c WHERE c.id = :id"),
    @NamedQuery(name = "Cloudstackplan.findByPlan", query = "SELECT c FROM Cloudstackplan c WHERE c.plan = :plan"),
    @NamedQuery(name = "Cloudstackplan.findByDescription", query = "SELECT c FROM Cloudstackplan c WHERE c.description = :description"),
    @NamedQuery(name = "Cloudstackplan.findByZoneid", query = "SELECT c FROM Cloudstackplan c WHERE c.zoneid = :zoneid"),
    @NamedQuery(name = "Cloudstackplan.findByTemplateid", query = "SELECT c FROM Cloudstackplan c WHERE c.templateid = :templateid"),
    @NamedQuery(name = "Cloudstackplan.findByHypervisor", query = "SELECT c FROM Cloudstackplan c WHERE c.hypervisor = :hypervisor"),
    @NamedQuery(name = "Cloudstackplan.findByServiceofferingid", query = "SELECT c FROM Cloudstackplan c WHERE c.serviceofferingid = :serviceofferingid"),
    @NamedQuery(name = "Cloudstackplan.findByDiskofferingid", query = "SELECT c FROM Cloudstackplan c WHERE c.diskofferingid = :diskofferingid"),
    @NamedQuery(name = "Cloudstackplan.findByNetworkofferingid", query = "SELECT c FROM Cloudstackplan c WHERE c.networkofferingid = :networkofferingid"),
    @NamedQuery(name = "Cloudstackplan.findByNetworkid", query = "SELECT c FROM Cloudstackplan c WHERE c.networkid = :networkid"),
    @NamedQuery(name = "Cloudstackplan.findByDomainid", query = "SELECT c FROM Cloudstackplan c WHERE c.domainid = :domainid")})
public class Cloudstackplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "plan")
    private String plan;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "zoneid")
    private String zoneid;
    @Basic(optional = false)
    @Column(name = "templateid")
    private String templateid;
    @Basic(optional = false)
    @Column(name = "hypervisor")
    private String hypervisor;
    @Basic(optional = false)
    @Column(name = "serviceofferingid")
    private String serviceofferingid;
    @Basic(optional = false)
    @Column(name = "diskofferingid")
    private String diskofferingid;
    @Basic(optional = false)
    @Column(name = "networkofferingid")
    private String networkofferingid;
    @Basic(optional = false)
    @Column(name = "networkid")
    private String networkid;
    @Basic(optional = false)
    @Column(name = "domainid")
    private String domainid;

    public Cloudstackplan() {
    }

    public Cloudstackplan(Integer id) {
        this.id = id;
    }

    public Cloudstackplan(Integer id, String plan, String description, String zoneid, String templateid, String hypervisor, String serviceofferingid, String diskofferingid, String networkofferingid, String networkid, String domainid) {
        this.id = id;
        this.plan = plan;
        this.description = description;
        this.zoneid = zoneid;
        this.templateid = templateid;
        this.hypervisor = hypervisor;
        this.serviceofferingid = serviceofferingid;
        this.diskofferingid = diskofferingid;
        this.networkofferingid = networkofferingid;
        this.networkid = networkid;
        this.domainid = domainid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZoneid() {
        return zoneid;
    }

    public void setZoneid(String zoneid) {
        this.zoneid = zoneid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    public String getServiceofferingid() {
        return serviceofferingid;
    }

    public void setServiceofferingid(String serviceofferingid) {
        this.serviceofferingid = serviceofferingid;
    }

    public String getDiskofferingid() {
        return diskofferingid;
    }

    public void setDiskofferingid(String diskofferingid) {
        this.diskofferingid = diskofferingid;
    }

    public String getNetworkofferingid() {
        return networkofferingid;
    }

    public void setNetworkofferingid(String networkofferingid) {
        this.networkofferingid = networkofferingid;
    }

    public String getNetworkid() {
        return networkid;
    }

    public void setNetworkid(String networkid) {
        this.networkid = networkid;
    }

    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
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
        if (!(object instanceof Cloudstackplan)) {
            return false;
        }
        Cloudstackplan other = (Cloudstackplan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Cloudstackplan[ id=" + id + " ]";
    }
    
}
