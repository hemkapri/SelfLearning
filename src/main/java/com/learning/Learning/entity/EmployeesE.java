package com.learning.Learning.entity;

import jakarta.persistence.*;

@Entity
@Table(name="EMPLOYEE_DATA")
public class EmployeesE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;

    @Column(name = "EMPLOYEE_NAME")
    private String empName;

    @Column(name = "EMPLOYEE_ADDRESS")
    private String empAddress;

    @Column(name = "EMPLOYEE_NUMBER")
    private long empMobileNo;

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
        return "EmployeeEntity{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empMobileNo=" + empMobileNo +
                '}';
    }
}
