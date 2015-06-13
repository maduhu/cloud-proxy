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
@Table(name = "asyncjob")
@NamedQueries({
    @NamedQuery(name = "Asyncjob.findAll", query = "SELECT a FROM Asyncjob a"),
    @NamedQuery(name = "Asyncjob.findByJobid", query = "SELECT a FROM Asyncjob a WHERE a.jobid = :jobid"),
    @NamedQuery(name = "Asyncjob.findByAccountid", query = "SELECT a FROM Asyncjob a WHERE a.accountid = :accountid"),
    @NamedQuery(name = "Asyncjob.findByCmd", query = "SELECT a FROM Asyncjob a WHERE a.cmd = :cmd"),
    @NamedQuery(name = "Asyncjob.findByCreated", query = "SELECT a FROM Asyncjob a WHERE a.created = :created"),
    @NamedQuery(name = "Asyncjob.findByJobinstanceid", query = "SELECT a FROM Asyncjob a WHERE a.jobinstanceid = :jobinstanceid"),
    @NamedQuery(name = "Asyncjob.findByJobinstancetype", query = "SELECT a FROM Asyncjob a WHERE a.jobinstancetype = :jobinstancetype"),
    @NamedQuery(name = "Asyncjob.findByJobprocstatus", query = "SELECT a FROM Asyncjob a WHERE a.jobprocstatus = :jobprocstatus"),
    @NamedQuery(name = "Asyncjob.findByJobresult", query = "SELECT a FROM Asyncjob a WHERE a.jobresult = :jobresult"),
    @NamedQuery(name = "Asyncjob.findByJobresultcode", query = "SELECT a FROM Asyncjob a WHERE a.jobresultcode = :jobresultcode"),
    @NamedQuery(name = "Asyncjob.findByJobresulttype", query = "SELECT a FROM Asyncjob a WHERE a.jobresulttype = :jobresulttype"),
    @NamedQuery(name = "Asyncjob.findByJobstatus", query = "SELECT a FROM Asyncjob a WHERE a.jobstatus = :jobstatus"),
    @NamedQuery(name = "Asyncjob.findByUserid", query = "SELECT a FROM Asyncjob a WHERE a.userid = :userid"),
    @NamedQuery(name = "Asyncjob.findByJobidcs", query = "SELECT a FROM Asyncjob a WHERE a.jobidcs = :jobidcs"),
    @NamedQuery(name = "Asyncjob.findAllByJobstatusAndJobprocstatus", query = "SELECT a FROM Asyncjob a WHERE a.jobstatus = :jobstatus AND a.jobprocstatus = :jobprocstatus")

})
public class Asyncjob implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "jobid")
    private String jobid;
    @Basic(optional = false)
    @Column(name = "accountid")
    private String accountid;
    @Basic(optional = false)
    @Column(name = "cmd")
    private String cmd;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "jobinstanceid")
    private String jobinstanceid;
    @Basic(optional = false)
    @Column(name = "jobinstancetype")
    private String jobinstancetype;
    @Basic(optional = false)
    @Column(name = "jobprocstatus")
    private String jobprocstatus;
    @Basic(optional = false)
    @Column(name = "jobresult")
    private String jobresult;
    @Basic(optional = false)
    @Column(name = "jobresultcode")
    private String jobresultcode;
    @Basic(optional = false)
    @Column(name = "jobresulttype")
    private String jobresulttype;
    @Basic(optional = false)
    @Column(name = "jobstatus")
    private String jobstatus;
    @Basic(optional = false)
    @Column(name = "userid")
    private String userid;
    @Basic(optional = false)
    @Column(name = "jobidcs")
    private String jobidcs;

    public Asyncjob() {
    }

    public Asyncjob(String jobid) {
        this.jobid = jobid;
    }

    public Asyncjob(String jobid, String accountid, String cmd, Date created, String jobinstanceid, String jobinstancetype, String jobprocstatus, String jobresult, String jobresultcode, String jobresulttype, String jobstatus, String userid, String jobidcs) {
        this.jobid = jobid;
        this.accountid = accountid;
        this.cmd = cmd;
        this.created = created;
        this.jobinstanceid = jobinstanceid;
        this.jobinstancetype = jobinstancetype;
        this.jobprocstatus = jobprocstatus;
        this.jobresult = jobresult;
        this.jobresultcode = jobresultcode;
        this.jobresulttype = jobresulttype;
        this.jobstatus = jobstatus;
        this.userid = userid;
        this.jobidcs = jobidcs;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getJobinstanceid() {
        return jobinstanceid;
    }

    public void setJobinstanceid(String jobinstanceid) {
        this.jobinstanceid = jobinstanceid;
    }

    public String getJobinstancetype() {
        return jobinstancetype;
    }

    public void setJobinstancetype(String jobinstancetype) {
        this.jobinstancetype = jobinstancetype;
    }

    public String getJobprocstatus() {
        return jobprocstatus;
    }

    public void setJobprocstatus(String jobprocstatus) {
        this.jobprocstatus = jobprocstatus;
    }

    public String getJobresult() {
        return jobresult;
    }

    public void setJobresult(String jobresult) {
        this.jobresult = jobresult;
    }

    public String getJobresultcode() {
        return jobresultcode;
    }

    public void setJobresultcode(String jobresultcode) {
        this.jobresultcode = jobresultcode;
    }

    public String getJobresulttype() {
        return jobresulttype;
    }

    public void setJobresulttype(String jobresulttype) {
        this.jobresulttype = jobresulttype;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getJobidcs() {
        return jobidcs;
    }

    public void setJobidcs(String jobidcs) {
        this.jobidcs = jobidcs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobid != null ? jobid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asyncjob)) {
            return false;
        }
        Asyncjob other = (Asyncjob) object;
        if ((this.jobid == null && other.jobid != null) || (this.jobid != null && !this.jobid.equals(other.jobid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Asyncjob[ jobid=" + jobid + " ]";
    }
    
}
