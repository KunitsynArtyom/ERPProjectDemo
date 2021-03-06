package main.net.cracker.project.model.entity;

import java.math.BigInteger;
import java.util.Date;

public class Vacation {
  private BigInteger vacationId;
  private BigInteger userId;
  private BigInteger projectId;
  private Date startDate;
  private Date endDate;
  private Boolean pmStatus;
  private Boolean lmStatus;
  private BigInteger pmId;
  private BigInteger lmId;


  public BigInteger getVacationId() {
    return vacationId;
  }

  public void setVacationId(BigInteger vacationId) {
    this.vacationId = vacationId;
  }

  public BigInteger getUserId() {
    return userId;
  }

  public void setUserId(BigInteger userId) {
    this.userId = userId;
  }

  public BigInteger getProjectId() {
    return projectId;
  }

  public void setProjectId(BigInteger projectId) {
    this.projectId = projectId;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Boolean getPmStatus() {
    return pmStatus;
  }

  public void setPmStatus(Boolean pmStatus) {
    this.pmStatus = pmStatus;
  }

  public Boolean getLmStatus() {
    return lmStatus;
  }

  public void setLmStatus(Boolean lmStatus) {
    this.lmStatus = lmStatus;
  }

  public BigInteger getPmId() {
    return pmId;
  }

  public void setPmId(BigInteger pmId) {
    this.pmId = pmId;
  }

  public BigInteger getLmId() {
    return lmId;
  }

  public void setLmId(BigInteger lmId) {
    this.lmId = lmId;
  }
}
