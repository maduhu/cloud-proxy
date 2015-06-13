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
 * @author jampajeen
 */
@Entity
@Table(name = "cloudstackuser")
@NamedQueries({
    @NamedQuery(name = "Cloudstackuser.findAll", query = "SELECT c FROM Cloudstackuser c"),
    @NamedQuery(name = "Cloudstackuser.findByAccountid", query = "SELECT c FROM Cloudstackuser c WHERE c.accountid = :accountid"),
    @NamedQuery(name = "Cloudstackuser.findByAccountname", query = "SELECT c FROM Cloudstackuser c WHERE c.accountname = :accountname"),
    @NamedQuery(name = "Cloudstackuser.findByAccountnameOrUsername", query = "SELECT c FROM Cloudstackuser c WHERE c.accountname = :accountname OR c.username = :username"),
    @NamedQuery(name = "Cloudstackuser.findByUserid", query = "SELECT c FROM Cloudstackuser c WHERE c.userid = :userid"),
    @NamedQuery(name = "Cloudstackuser.findByUsername", query = "SELECT c FROM Cloudstackuser c WHERE c.username = :username"),
    @NamedQuery(name = "Cloudstackuser.findByEmail", query = "SELECT c FROM Cloudstackuser c WHERE c.email = :email"),
    @NamedQuery(name = "Cloudstackuser.findByPassword", query = "SELECT c FROM Cloudstackuser c WHERE c.password = :password"),
    @NamedQuery(name = "Cloudstackuser.findByJob", query = "SELECT c FROM Cloudstackuser c WHERE c.job = :job"),
    @NamedQuery(name = "Cloudstackuser.findByGender", query = "SELECT c FROM Cloudstackuser c WHERE c.gender = :gender")})
public class Cloudstackuser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "accountid")
    private String accountid;
    @Basic(optional = false)
    @Column(name = "accountname")
    private String accountname;
    @Basic(optional = false)
    @Column(name = "userid")
    private String userid;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "job")
    private String job;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;

    public Cloudstackuser() {
    }

    public Cloudstackuser(String username) {
        this.username = username;
    }

    public Cloudstackuser(String username, String accountid, String accountname, String userid, String email, String password, String job, String gender) {
        this.username = username;
        this.accountid = accountid;
        this.accountname = accountname;
        this.userid = userid;
        this.email = email;
        this.password = password;
        this.job = job;
        this.gender = gender;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cloudstackuser)) {
            return false;
        }
        Cloudstackuser other = (Cloudstackuser) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rinxor.cloud.db.mysql.Cloudstackuser[ username=" + username + " ]";
    }
    
}
