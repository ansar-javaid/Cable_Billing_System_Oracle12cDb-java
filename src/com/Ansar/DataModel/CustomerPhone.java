package com.Ansar.DataModel;


public class CustomerPhone extends ProfessionalDetails{

 // private int customerId; //This
  private String phoneNumber;

 /**
  * @param customerId
  * @param phoneNumber
  */
  public CustomerPhone(int customerId, String phoneNumber) {
   super(customerId);
   this.phoneNumber = phoneNumber;
  }
 //Getters & Setters----------------------------------------------------------------------------------------------------
 public String getPhoneNumber() { return phoneNumber; }
 public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
 //=====================================================================================================================
}
