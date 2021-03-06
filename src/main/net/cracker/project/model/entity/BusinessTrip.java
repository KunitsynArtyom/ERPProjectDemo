package main.net.cracker.project.model.entity;

import java.math.BigInteger;
import java.util.Date;

public class BusinessTrip {

  private BigInteger businessTripId;
  private BigInteger projectId;
  private BigInteger userId;
  private BigInteger authorId;
  private String userName;
  private String country;
  private Date startDate;
  private Date endDate;
  private Boolean status;

  public BigInteger getBusinessTripId() {
    return businessTripId;
  }

  public void setBusinessTripId(BigInteger businessTripId) {
    this.businessTripId = businessTripId;
  }

  public BigInteger getProjectId() {
    return projectId;
  }

  public void setProjectId(BigInteger projectId) {
    this.projectId = projectId;
  }

  public BigInteger getUserId() {
    return userId;
  }

  public void setUserId(BigInteger userId) {
    this.userId = userId;
  }

  public BigInteger getAuthorId() {
    return authorId;
  }

  public void setAuthorId(BigInteger authorId) {
    this.authorId = authorId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
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

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }
}
