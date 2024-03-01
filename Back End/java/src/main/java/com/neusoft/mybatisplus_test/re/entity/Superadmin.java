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
public class Superadmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("super_admin_id")
    private Integer superAdminId;

    private String superAdminFirstName;

    private String superAdminLastName;

    private String superAdminPassword;

    private String superAdminEmail;

    private String superAdminName;

    public Superadmin(String superAdminFirstName, String superAdminLastName, String superAdminPassword, String superAdminEmail, String superAdminName) {
        this.superAdminFirstName = superAdminFirstName;
        this.superAdminLastName = superAdminLastName;
        this.superAdminPassword = superAdminPassword;
        this.superAdminEmail = superAdminEmail;
        this.superAdminName = superAdminName;
    }

    public Superadmin(Integer superAdminId, String superAdminFirstName, String superAdminLastName, String superAdminPassword, String superAdminEmail, String superAdminName) {
        this.superAdminId = superAdminId;
        this.superAdminFirstName = superAdminFirstName;
        this.superAdminLastName = superAdminLastName;
        this.superAdminPassword = superAdminPassword;
        this.superAdminEmail = superAdminEmail;
        this.superAdminName = superAdminName;
    }

    public Integer getSuperAdminId() {
        return superAdminId;
    }

    public void setSuperAdminId(Integer superAdminId) {
        this.superAdminId = superAdminId;
    }

    public String getSuperAdminFirstName() {
        return superAdminFirstName;
    }

    public void setSuperAdminFirstName(String superAdminFirstName) {
        this.superAdminFirstName = superAdminFirstName;
    }

    public String getSuperAdminLastName() {
        return superAdminLastName;
    }

    public void setSuperAdminLastName(String superAdminLastName) {
        this.superAdminLastName = superAdminLastName;
    }

    public String getSuperAdminPassword() {
        return superAdminPassword;
    }

    public void setSuperAdminPassword(String superAdminPassword) {
        this.superAdminPassword = superAdminPassword;
    }

    public String getSuperAdminEmail() {
        return superAdminEmail;
    }

    public void setSuperAdminEmail(String superAdminEmail) {
        this.superAdminEmail = superAdminEmail;
    }

    public String getSuperAdminName() {
        return superAdminName;
    }

    public void setSuperAdminName(String superAdminName) {
        this.superAdminName = superAdminName;
    }

    @Override
    public String toString() {
        return "Superadmin{" +
                "superAdminId=" + superAdminId +
                ", superAdminFirstName=" + superAdminFirstName +
                ", superAdminLastName=" + superAdminLastName +
                ", superAdminPassword=" + superAdminPassword +
                ", superAdminEmail=" + superAdminEmail +
                ", superAdminName=" + superAdminName +
                "}";
    }
}