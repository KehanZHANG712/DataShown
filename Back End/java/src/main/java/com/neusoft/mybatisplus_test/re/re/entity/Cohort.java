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
public class Cohort implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("cohort_id")
    private Integer cohortId;

    private String cohortTitle;

    private String cohortTags;

    private String cohortWebLink;

    private String cohortIntroducton;

    private String cohortFunding;

    private String cohortKeyPublication;

    private Integer cohortParticipants;

    private Integer cohortMparticipants;

    private Integer cohortFparticipants;

    private Integer cohortMean;

    private Integer cohort20;

    private Integer cohort2039;

    private Integer cohort4059;

    private Integer cohort60;

    private String cohortSource;

    private Integer cohortStartyear;

    private Integer cohortRecentyear;

    private String cohortAvayears;

    private Integer cohortNumfollow;

    private Integer cohortWithdraw;

    private Integer cohortLost;

    private Integer cohortDecrease;

    private Integer cohortComplete;

    private String cohortTimephase;

    private String cohortAnthropometrics;

    private String cohortLifestyle;

    private String cohortHealth;

    private Integer cohortOwner;

    public Cohort(String cohortTitle, String cohortTags, String cohortWebLink, String cohortIntroducton, String cohortFunding, String cohortKeyPublication, Integer cohortParticipants, Integer cohortMparticipants, Integer cohortFparticipants, Integer cohortMean, Integer cohort20, Integer cohort2039, Integer cohort4059, Integer cohort60, String cohortSource, Integer cohortStartyear, Integer cohortRecentyear, String cohortAvayears, Integer cohortNumfollow, Integer cohortWithdraw, Integer cohortLost, Integer cohortDecrease, Integer cohortComplete, String cohortTimephase, String cohortAnthropometrics, String cohortLifestyle, String cohortHealth, Integer cohortOwner) {
        this.cohortTitle = cohortTitle;
        this.cohortTags = cohortTags;
        this.cohortWebLink = cohortWebLink;
        this.cohortIntroducton = cohortIntroducton;
        this.cohortFunding = cohortFunding;
        this.cohortKeyPublication = cohortKeyPublication;
        this.cohortParticipants = cohortParticipants;
        this.cohortMparticipants = cohortMparticipants;
        this.cohortFparticipants = cohortFparticipants;
        this.cohortMean = cohortMean;
        this.cohort20 = cohort20;
        this.cohort2039 = cohort2039;
        this.cohort4059 = cohort4059;
        this.cohort60 = cohort60;
        this.cohortSource = cohortSource;
        this.cohortStartyear = cohortStartyear;
        this.cohortRecentyear = cohortRecentyear;
        this.cohortAvayears = cohortAvayears;
        this.cohortNumfollow = cohortNumfollow;
        this.cohortWithdraw = cohortWithdraw;
        this.cohortLost = cohortLost;
        this.cohortDecrease = cohortDecrease;
        this.cohortComplete = cohortComplete;
        this.cohortTimephase = cohortTimephase;
        this.cohortAnthropometrics = cohortAnthropometrics;
        this.cohortLifestyle = cohortLifestyle;
        this.cohortHealth = cohortHealth;
        this.cohortOwner = cohortOwner;
    }

    public Cohort(Integer cohortId, String cohortTitle, String cohortTags, String cohortWebLink, String cohortIntroducton, String cohortFunding, String cohortKeyPublication, Integer cohortParticipants, Integer cohortMparticipants, Integer cohortFparticipants, Integer cohortMean, Integer cohort20, Integer cohort2039, Integer cohort4059, Integer cohort60, String cohortSource, Integer cohortStartyear, Integer cohortRecentyear, String cohortAvayears, Integer cohortNumfollow, Integer cohortWithdraw, Integer cohortLost, Integer cohortDecrease, Integer cohortComplete, String cohortTimephase, String cohortAnthropometrics, String cohortLifestyle, String cohortHealth, Integer cohortOwner) {
        this.cohortId = cohortId;
        this.cohortTitle = cohortTitle;
        this.cohortTags = cohortTags;
        this.cohortWebLink = cohortWebLink;
        this.cohortIntroducton = cohortIntroducton;
        this.cohortFunding = cohortFunding;
        this.cohortKeyPublication = cohortKeyPublication;
        this.cohortParticipants = cohortParticipants;
        this.cohortMparticipants = cohortMparticipants;
        this.cohortFparticipants = cohortFparticipants;
        this.cohortMean = cohortMean;
        this.cohort20 = cohort20;
        this.cohort2039 = cohort2039;
        this.cohort4059 = cohort4059;
        this.cohort60 = cohort60;
        this.cohortSource = cohortSource;
        this.cohortStartyear = cohortStartyear;
        this.cohortRecentyear = cohortRecentyear;
        this.cohortAvayears = cohortAvayears;
        this.cohortNumfollow = cohortNumfollow;
        this.cohortWithdraw = cohortWithdraw;
        this.cohortLost = cohortLost;
        this.cohortDecrease = cohortDecrease;
        this.cohortComplete = cohortComplete;
        this.cohortTimephase = cohortTimephase;
        this.cohortAnthropometrics = cohortAnthropometrics;
        this.cohortLifestyle = cohortLifestyle;
        this.cohortHealth = cohortHealth;
        this.cohortOwner = cohortOwner;
    }



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCohortId() {
        return cohortId;
    }

    public String getCohortTitle() {
        return cohortTitle;
    }

    public String getCohortTags() {
        return cohortTags;
    }

    public String getCohortWebLink() {
        return cohortWebLink;
    }

    public String getCohortIntroducton() {
        return cohortIntroducton;
    }

    public String getCohortFunding() {
        return cohortFunding;
    }

    public String getCohortKeyPublication() {
        return cohortKeyPublication;
    }

    public Integer getCohortParticipants() {
        return cohortParticipants;
    }

    public Integer getCohortMparticipants() {
        return cohortMparticipants;
    }

    public Integer getCohortFparticipants() {
        return cohortFparticipants;
    }

    public Integer getCohortMean() {
        return cohortMean;
    }

    public Integer getCohort20() {
        return cohort20;
    }

    public Integer getCohort2039() {
        return cohort2039;
    }

    public Integer getCohort4059() {
        return cohort4059;
    }

    public Integer getCohort60() {
        return cohort60;
    }

    public String getCohortSource() {
        return cohortSource;
    }

    public Integer getCohortStartyear() {
        return cohortStartyear;
    }

    public Integer getCohortRecentyear() {
        return cohortRecentyear;
    }

    public String getCohortAvayears() {
        return cohortAvayears;
    }

    public Integer getCohortNumfollow() {
        return cohortNumfollow;
    }

    public Integer getCohortWithdraw() {
        return cohortWithdraw;
    }

    public Integer getCohortLost() {
        return cohortLost;
    }

    public Integer getCohortDecrease() {
        return cohortDecrease;
    }

    public Integer getCohortComplete() {
        return cohortComplete;
    }

    public String getCohortTimephase() {
        return cohortTimephase;
    }

    public String getCohortAnthropometrics() {
        return cohortAnthropometrics;
    }

    public String getCohortLifestyle() {
        return cohortLifestyle;
    }

    public String getCohortHealth() {
        return cohortHealth;
    }

    public Integer getCohortOwner() {
        return cohortOwner;
    }

    public void setCohortId(Integer cohortId) {
        this.cohortId = cohortId;
    }

    public void setCohortTitle(String cohortTitle) {
        this.cohortTitle = cohortTitle;
    }

    public void setCohortTags(String cohortTags) {
        this.cohortTags = cohortTags;
    }

    public void setCohortWebLink(String cohortWebLink) {
        this.cohortWebLink = cohortWebLink;
    }

    public void setCohortIntroducton(String cohortIntroducton) {
        this.cohortIntroducton = cohortIntroducton;
    }

    public void setCohortFunding(String cohortFunding) {
        this.cohortFunding = cohortFunding;
    }

    public void setCohortKeyPublication(String cohortKeyPublication) {
        this.cohortKeyPublication = cohortKeyPublication;
    }

    public void setCohortParticipants(Integer cohortParticipants) {
        this.cohortParticipants = cohortParticipants;
    }

    public void setCohortMparticipants(Integer cohortMparticipants) {
        this.cohortMparticipants = cohortMparticipants;
    }

    public void setCohortFparticipants(Integer cohortFparticipants) {
        this.cohortFparticipants = cohortFparticipants;
    }

    public void setCohortMean(Integer cohortMean) {
        this.cohortMean = cohortMean;
    }

    public void setCohort20(Integer cohort20) {
        this.cohort20 = cohort20;
    }

    public void setCohort2039(Integer cohort2039) {
        this.cohort2039 = cohort2039;
    }

    public void setCohort4059(Integer cohort4059) {
        this.cohort4059 = cohort4059;
    }

    public void setCohort60(Integer cohort60) {
        this.cohort60 = cohort60;
    }

    public void setCohortSource(String cohortSource) {
        this.cohortSource = cohortSource;
    }

    public void setCohortStartyear(Integer cohortStartyear) {
        this.cohortStartyear = cohortStartyear;
    }

    public void setCohortRecentyear(Integer cohortRecentyear) {
        this.cohortRecentyear = cohortRecentyear;
    }

    public void setCohortAvayears(String cohortAvayears) {
        this.cohortAvayears = cohortAvayears;
    }

    public void setCohortNumfollow(Integer cohortNumfollow) {
        this.cohortNumfollow = cohortNumfollow;
    }

    public void setCohortWithdraw(Integer cohortWithdraw) {
        this.cohortWithdraw = cohortWithdraw;
    }

    public void setCohortLost(Integer cohortLost) {
        this.cohortLost = cohortLost;
    }

    public void setCohortDecrease(Integer cohortDecrease) {
        this.cohortDecrease = cohortDecrease;
    }

    public void setCohortComplete(Integer cohortComplete) {
        this.cohortComplete = cohortComplete;
    }

    public void setCohortTimephase(String cohortTimephase) {
        this.cohortTimephase = cohortTimephase;
    }

    public void setCohortAnthropometrics(String cohortAnthropometrics) {
        this.cohortAnthropometrics = cohortAnthropometrics;
    }

    public void setCohortLifestyle(String cohortLifestyle) {
        this.cohortLifestyle = cohortLifestyle;
    }

    public void setCohortHealth(String cohortHealth) {
        this.cohortHealth = cohortHealth;
    }

    public void setCohortOwner(Integer cohortOwner) {
        this.cohortOwner = cohortOwner;
    }
}