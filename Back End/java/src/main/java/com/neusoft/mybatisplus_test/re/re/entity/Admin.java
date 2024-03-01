package com.neusoft.mybatisplus_test.re.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author whh
 * @since 2022-09-12
 */
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId("admin_id")
    private Integer adminId;

    private String adminPassword;

    private String adminFirstName;

    private String adminLastName;

    private String adminEmail;

    private String adminName;

    public Admin(String adminPassword, String adminFirstName, String adminLastName, String adminEmail, String adminName) {
        this.adminPassword = adminPassword;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminEmail = adminEmail;
        this.adminName = adminName;
    }

    public Admin(Integer adminId, String adminPassword, String adminFirstName, String adminLastName, String adminEmail, String adminName) {
        this.adminId = adminId;
        this.adminPassword = adminPassword;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminEmail = adminEmail;
        this.adminName = adminName;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminPassword=" + adminPassword +
                ", adminFirstName=" + adminFirstName +
                ", adminLastName=" + adminLastName +
                ", adminEmail=" + adminEmail +
                ", adminName=" + adminName +
                "}";
    }
}