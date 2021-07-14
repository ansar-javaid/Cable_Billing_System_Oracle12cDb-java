package com.Ansar.DataModel;


import java.sql.Date;

public class Oder extends ProfessionalDetails{
  private int orderId;
 // private int customerId; //This
  private java.sql.Date orderDate;
  private int serviceId;

    /**
     * @param orderId
     * @param customerId
     * @param orderDate
     * @param serviceId
     */
    public Oder(int orderId, int customerId, Date orderDate, int serviceId) {
        super(customerId);
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.serviceId = serviceId;
    }
  //Getters & Setters---------------------------------------------------------------------------------------------------
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    public int getServiceId() { return serviceId; }
    public void setServiceId(int serviceId) { this.serviceId = serviceId; }
  //====================================================================================================================
}
