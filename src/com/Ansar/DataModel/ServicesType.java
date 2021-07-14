package com.Ansar.DataModel;


public class ServicesType {
  private int serviceId;
  private String serviceType;

  /**
   * @param serviceId
   * @param serviceType
   */
  public ServicesType(int serviceId, String serviceType) {
    this.serviceId = serviceId;
    this.serviceType = serviceType;
  }

  //Getters & Setters---------------------------------------------------------------------------------------------------
  public int getServiceId() { return serviceId; }
  public void setServiceId(int serviceId) { this.serviceId = serviceId; }
  public String getServiceType() { return serviceType; }
  public void setServiceType(String serviceType) { this.serviceType = serviceType; }
  //====================================================================================================================

}
