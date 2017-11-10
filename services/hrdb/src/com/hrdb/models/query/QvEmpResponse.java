/*Generated by WaveMaker Studio*/
package com.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class QvEmpResponse implements Serializable {


    @ColumnAlias("EMP_ID")
    private BigInteger empId;

    @ColumnAlias("FIRSTNAME")
    private String firstname;

    @ColumnAlias("LASTNAME")
    private String lastname;

    @ColumnAlias("STREET")
    private String street;

    @ColumnAlias("CITY")
    private String city;

    @ColumnAlias("STATE")
    private String state;

    @ColumnAlias("ZIP")
    private String zip;

    @ColumnAlias("BIRTHDATE")
    private Date birthdate;

    @ColumnAlias("PICURL")
    private String picurl;

    @ColumnAlias("JOB_TITLE")
    private String jobTitle;

    @ColumnAlias("DEPT_ID")
    private BigInteger deptId;

    @ColumnAlias("USERNAME")
    private String username;

    @ColumnAlias("PASSWORD")
    private String password;

    @ColumnAlias("ROLE")
    private String role;

    @ColumnAlias("MANAGER_ID")
    private BigInteger managerId;

    @ColumnAlias("TENANT_ID")
    private BigInteger tenantId;

    public BigInteger getEmpId() {
        return this.empId;
    }

    public void setEmpId(BigInteger empId) {
        this.empId = empId;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPicurl() {
        return this.picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public BigInteger getDeptId() {
        return this.deptId;
    }

    public void setDeptId(BigInteger deptId) {
        this.deptId = deptId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigInteger getManagerId() {
        return this.managerId;
    }

    public void setManagerId(BigInteger managerId) {
        this.managerId = managerId;
    }

    public BigInteger getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(BigInteger tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QvEmpResponse)) return false;
        final QvEmpResponse qvEmpResponse = (QvEmpResponse) o;
        return Objects.equals(getEmpId(), qvEmpResponse.getEmpId()) &&
                Objects.equals(getFirstname(), qvEmpResponse.getFirstname()) &&
                Objects.equals(getLastname(), qvEmpResponse.getLastname()) &&
                Objects.equals(getStreet(), qvEmpResponse.getStreet()) &&
                Objects.equals(getCity(), qvEmpResponse.getCity()) &&
                Objects.equals(getState(), qvEmpResponse.getState()) &&
                Objects.equals(getZip(), qvEmpResponse.getZip()) &&
                Objects.equals(getBirthdate(), qvEmpResponse.getBirthdate()) &&
                Objects.equals(getPicurl(), qvEmpResponse.getPicurl()) &&
                Objects.equals(getJobTitle(), qvEmpResponse.getJobTitle()) &&
                Objects.equals(getDeptId(), qvEmpResponse.getDeptId()) &&
                Objects.equals(getUsername(), qvEmpResponse.getUsername()) &&
                Objects.equals(getPassword(), qvEmpResponse.getPassword()) &&
                Objects.equals(getRole(), qvEmpResponse.getRole()) &&
                Objects.equals(getManagerId(), qvEmpResponse.getManagerId()) &&
                Objects.equals(getTenantId(), qvEmpResponse.getTenantId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(),
                getFirstname(),
                getLastname(),
                getStreet(),
                getCity(),
                getState(),
                getZip(),
                getBirthdate(),
                getPicurl(),
                getJobTitle(),
                getDeptId(),
                getUsername(),
                getPassword(),
                getRole(),
                getManagerId(),
                getTenantId());
    }
}