package com.Ansar.DataModel;


public class Services {

  private int serviceId;
  private String serviceName;

  /**
   * @param serviceId
   * @param serviceName
   */
  public Services(int serviceId, String serviceName) {
    this.serviceId = serviceId;
    this.serviceName = serviceName;
  }
  //Getters & Setters---------------------------------------------------------------------------------------------------
  public int getServiceId() { return serviceId; }
  public void setServiceId(int serviceId) { this.serviceId = serviceId; }
  public String getServiceName() { return serviceName; }
  public void setServiceName(String serviceName) { this.serviceName = serviceName; }
  //====================================================================================================================
}
