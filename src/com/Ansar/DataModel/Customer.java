package com.Ansar.DataModel;


public class Customer extends ProfessionalDetails {

 // private int customerId;  //This
 // private String customerName; //This
 // private int employeeId; //This
  private String address;

 /**
  * @param customerId
  * @param Name
  * @param employeeId
  * @param address
  */
 public Customer(int customerId, String Name, int employeeId, String address) {
  super(customerId,Name,employeeId);
  this.address = address;
 }
 //Getters & Setters----------------------------------------------------------------------------------------------------
 public String getAddress() { return address; }
 public void setAddress(String address) { this.address = address; }
 //=====================================================================================================================
}
