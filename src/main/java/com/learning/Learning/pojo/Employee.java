package com.learning.Learning.pojo;

public class Employee implements Cloneable{

    private long empId;
    private String empName;
    private String empAddress;
    private long empMobileNo;

    public Employee(long empId, String empName, String empAddress, long empMobileNo) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empMobileNo = empMobileNo;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public long getEmpMobileNo() {
        return empMobileNo;
    }

    public void setEmpMobileNo(long empMobileNo) {
        this.empMobileNo = empMobileNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empMobileNo=" + empMobileNo +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
