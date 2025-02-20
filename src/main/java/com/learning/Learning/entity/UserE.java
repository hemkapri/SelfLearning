package com.learning.Learning.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USER_DETAILS")
public class UserE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_ADDRESS")
    private String userAddress;

    @Column(name = "USER_MOBILE")
    private long userMobileNumber;

    @Column(name = "USER_POSITION")
    private String userPosition;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public long getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(long userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public UserE() {

    }

    @Override
    public String toString() {
        return "UserE{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userMobileNumber=" + userMobileNumber +
                ", userPosition='" + userPosition + '\'' +
                '}';
    }
}
