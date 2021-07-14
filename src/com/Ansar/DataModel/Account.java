package com.Ansar.DataModel;


public class Account extends ProfessionalDetails {
  private int accountNumber;
  private String accountDetail;
  private String accountType;
 // private int customerId;  // This
  //Constructor---------------------------------------------------------------------------------------------------------
  /**
   * @param accountNumber
   * @param accountDetail
   * @param accountType
   * @param customerId
   */
  public Account(int accountNumber, String accountDetail, String accountType,int customerId) {
    super(customerId);
    this.accountNumber = accountNumber;
    this.accountDetail = accountDetail;
    this.accountType = accountType;
  }
  //Getters & Setters---------------------------------------------------------------------------------------------------
  public int getAccountNumber() { return accountNumber; }
  public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
  public String getAccountDetail() { return accountDetail; }
  public void setAccountDetail(String accountDetail) { this.accountDetail = accountDetail; }
  public String getAccountType() { return accountType; }
  public void setAccountType(String accountType) { this.accountType = accountType; }
  //====================================================================================================================
}
