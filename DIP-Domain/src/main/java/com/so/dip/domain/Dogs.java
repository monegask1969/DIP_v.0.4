/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moneg
 */
@Entity
@Table(name = "dogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dogs.findAll", query = "SELECT d FROM Dogs d"),
    @NamedQuery(name = "Dogs.findById", query = "SELECT d FROM Dogs d WHERE d.id = :id"),
    @NamedQuery(name = "Dogs.findByBreed", query = "SELECT d FROM Dogs d WHERE d.breed = :breed"),
    @NamedQuery(name = "Dogs.findByGender", query = "SELECT d FROM Dogs d WHERE d.gender = :gender"),
    @NamedQuery(name = "Dogs.findByName", query = "SELECT d FROM Dogs d WHERE d.name = :name"),
    @NamedQuery(name = "Dogs.findByDob", query = "SELECT d FROM Dogs d WHERE d.dob = :dob"),
    @NamedQuery(name = "Dogs.findByColor", query = "SELECT d FROM Dogs d WHERE d.color = :color"),
    @NamedQuery(name = "Dogs.findByChip", query = "SELECT d FROM Dogs d WHERE d.chip = :chip"),
    @NamedQuery(name = "Dogs.findByBrand", query = "SELECT d FROM Dogs d WHERE d.brand = :brand"),
    @NamedQuery(name = "Dogs.findByPedigree", query = "SELECT d FROM Dogs d WHERE d.pedigree = :pedigree"),
    @NamedQuery(name = "Dogs.findByOwnerscity", query = "SELECT d FROM Dogs d WHERE d.ownerscity = :ownerscity"),
    @NamedQuery(name = "Dogs.findBySire", query = "SELECT d FROM Dogs d WHERE d.sire = :sire"),
    @NamedQuery(name = "Dogs.findByDam", query = "SELECT d FROM Dogs d WHERE d.dam = :dam"),
    @NamedQuery(name = "Dogs.findByFcigroup", query = "SELECT d FROM Dogs d WHERE d.fcigroup = :fcigroup"),
    @NamedQuery(name = "Dogs.findByOwnfname", query = "SELECT d FROM Dogs d WHERE d.ownfname = :ownfname"),
    @NamedQuery(name = "Dogs.findByOwnsname", query = "SELECT d FROM Dogs d WHERE d.ownsname = :ownsname"),
    @NamedQuery(name = "Dogs.findByOwnlname", query = "SELECT d FROM Dogs d WHERE d.ownlname = :ownlname"),
    @NamedQuery(name = "Dogs.findByBrefname", query = "SELECT d FROM Dogs d WHERE d.brefname = :brefname"),
    @NamedQuery(name = "Dogs.findByBresname", query = "SELECT d FROM Dogs d WHERE d.bresname = :bresname"),
    @NamedQuery(name = "Dogs.findByBrelname", query = "SELECT d FROM Dogs d WHERE d.brelname = :brelname")})
public class Dogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "breed")
    private String breed;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "chip")
    private String chip;
    @Basic(optional = false)
    @Column(name = "brand")
    private String brand;
    @Basic(optional = false)
    @Column(name = "pedigree")
    private String pedigree;
    @Basic(optional = false)
    @Column(name = "ownerscity")
    private String ownerscity;
    @Basic(optional = false)
    @Column(name = "sire")
    private String sire;
    @Basic(optional = false)
    @Column(name = "dam")
    private String dam;
    @Basic(optional = false)
    @Column(name = "fcigroup")
    private int fcigroup;
    @Basic(optional = false)
    @Column(name = "ownfname")
    private String ownfname;
    @Basic(optional = false)
    @Column(name = "ownsname")
    private String ownsname;
    @Basic(optional = false)
    @Column(name = "ownlname")
    private String ownlname;
    @Basic(optional = false)
    @Column(name = "brefname")
    private String brefname;
    @Basic(optional = false)
    @Column(name = "bresname")
    private String bresname;
    @Basic(optional = false)
    @Column(name = "brelname")
    private String brelname;

    public Dogs() {
    }

    public Dogs(Integer id) {
        this.id = id;
    }

    public Dogs(Integer id, String breed, String gender, String name, Date dob, String color, String chip, String brand, String pedigree, String ownerscity, String sire, String dam, int fcigroup, String ownfname, String ownsname, String ownlname, String brefname, String bresname, String brelname) {
        this.id = id;
        this.breed = breed;
        this.gender = gender;
        this.name = name;
        this.dob = dob;
        this.color = color;
        this.chip = chip;
        this.brand = brand;
        this.pedigree = pedigree;
        this.ownerscity = ownerscity;
        this.sire = sire;
        this.dam = dam;
        this.fcigroup = fcigroup;
        this.ownfname = ownfname;
        this.ownsname = ownsname;
        this.ownlname = ownlname;
        this.brefname = brefname;
        this.bresname = bresname;
        this.brelname = brelname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getOwnerscity() {
        return ownerscity;
    }

    public void setOwnerscity(String ownerscity) {
        this.ownerscity = ownerscity;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public int getFcigroup() {
        return fcigroup;
    }

    public void setFcigroup(int fcigroup) {
        this.fcigroup = fcigroup;
    }

    public String getOwnfname() {
        return ownfname;
    }

    public void setOwnfname(String ownfname) {
        this.ownfname = ownfname;
    }

    public String getOwnsname() {
        return ownsname;
    }

    public void setOwnsname(String ownsname) {
        this.ownsname = ownsname;
    }

    public String getOwnlname() {
        return ownlname;
    }

    public void setOwnlname(String ownlname) {
        this.ownlname = ownlname;
    }

    public String getBrefname() {
        return brefname;
    }

    public void setBrefname(String brefname) {
        this.brefname = brefname;
    }

    public String getBresname() {
        return bresname;
    }

    public void setBresname(String bresname) {
        this.bresname = bresname;
    }

    public String getBrelname() {
        return brelname;
    }

    public void setBrelname(String brelname) {
        this.brelname = brelname;
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
        if (!(object instanceof Dogs)) {
            return false;
        }
        Dogs other = (Dogs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.so.dip.domain.Dogs[ id=" + id + " ]";
    }
    
}
